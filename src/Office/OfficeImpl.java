/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;
import AssistanceTouristique.*;
import Site.ServeurSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.omg.CORBA.*; 
import org.omg.PortableServer.*; 
import org.omg.CosNaming.*; 
import org.omg.CosNaming.NamingContextPackage.*;

/**
 *
 * @author Lydia
 */
public class OfficeImpl extends OfficePOA {
    private org.omg.CORBA.ORB orb;
    private HashMap<Short, String> listeSite;
    private int nb_sites;
    private SiteTouristique monSite;
    private ServiceESSite monServES;
    
    public OfficeImpl(org.omg.CORBA.ORB orb, HashMap listeSite) {
        this.orb=orb;
        this.listeSite=listeSite;
        this.nb_sites=this.listeSite.size();
        
        try {
            NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(this.orb.resolve_initial_references("NameService"));
            Set set = listeSite.entrySet();
            Iterator it = set.iterator();
            //Pour chaque site
             while(it.hasNext()) {
                Map.Entry site = (Map.Entry)it.next();
                /*********** Recherche du site ***********/
                org.omg.CosNaming.NameComponent[] nameToFind = new org.omg.CosNaming.NameComponent[1];
                nameToFind[0] = new org.omg.CosNaming.NameComponent((String)site.getValue(), "");
                org.omg.CORBA.Object distantSite = nameRoot.resolve(nameToFind);
                
                this.monSite = SiteTouristiqueHelper.narrow(distantSite);
                
                /********** Recherche du service E/S du site *********/
                String nomServES = "ES "+(String)site.getValue();
                nameToFind[0] = new org.omg.CosNaming.NameComponent(nomServES, "");
                org.omg.CORBA.Object distantServES = nameRoot.resolve(nameToFind);
                
                this.monServES = ServiceESSiteHelper.narrow(distantServES);
             }
        }
	catch (Exception e) {
		e.printStackTrace();
	}  
    }
            
    public Site[] getListeSitesAVisiter(short idCarte, Coordonnees coordGPS, short[] listeSitesVisites) {
        Site[] siteAVisiter = new Site[this.nb_sites];
        int i=0;
        int affluenceCourante;
        Site infoSite;
        try {
            //Si le touriste possede une carte 
            /*if(idCarte > 1) {
            
            }
            else {*/
                //siteAVisiter = new Site[this.nb_sites];
                //La liste des sites est celle de l'office
                Set set = listeSite.entrySet();
                Iterator it = set.iterator();
                //Pour chaque site
                while(it.hasNext()) {
                    Map.Entry site = (Map.Entry)it.next();
                    //Récupération des informations générales du site auprès le site
                    infoSite = this.monSite.getInfoSite((short)site.getKey());
                   
                    //Récupération de l'affluence courante auprès du service ES du site
                    affluenceCourante = this.monServES.getAffluenceCourante((short)site.getKey());
                    
                    siteAVisiter[i] = new Site(infoSite.idSite, infoSite.titre, infoSite.coord, infoSite.horaire0uverture, infoSite.horaireFermeture, infoSite.description, infoSite.adresse, infoSite.telephone, affluenceCourante);
                    i++;
                }
            //}

        }
	catch (Exception e) {
		e.printStackTrace();
	}
        
        return siteAVisiter; 
    }
    
}
