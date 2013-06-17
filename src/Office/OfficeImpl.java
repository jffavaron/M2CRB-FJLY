/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;
import AssistanceTouristique.*;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.omg.CosNaming.*; 

/**
 *
 * @author Lydia
 */
public class OfficeImpl extends OfficePOA {
    private org.omg.CORBA.ORB orb;
    //private HashMap<Short, String> listeSite;
    //private short[] listeSite;
    private Hashtable<Short, String> listeSite;
    private int nb_sites;
    //TODO
    private SiteTouristique[] mesSites; 
    private ServiceESSite[] mesServES;
    private OfficeDBManager db;
    //private NamingContext nameRoot;
    
    public OfficeImpl(org.omg.CORBA.ORB orb, /*short[] listeSite*/ Hashtable<Short, String> listeSite) {
        this.orb=orb;
        this.listeSite=listeSite;
        //this.nb_sites=this.listeSite.length;
        this.nb_sites=this.listeSite.size();
        this.mesSites = new SiteTouristique[this.nb_sites];
        this.mesServES = new ServiceESSite[this.nb_sites];
        this.db = new OfficeDBManager();
        
        short idSite;
        int i = 0;
        try {
            NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(this.orb.resolve_initial_references("NameService"));
            Set set = listeSite.entrySet();
            Iterator it = set.iterator();  
            
            //Pour chaque site
            //for(int i=0; i<this.listeSite.length; i++) {
             while(it.hasNext()) {
                   Map.Entry site = (Map.Entry)it.next();
                   idSite = (short) site.getKey();
                 //string listeSite.get(site);
                /*********** Recherche du site ***********/ 
                String codeSite = this.db.getCodeSite(idSite);
                System.out.println("nom site " + codeSite);
                org.omg.CosNaming.NameComponent[] nameToFind = new org.omg.CosNaming.NameComponent[1];
                nameToFind[0] = new org.omg.CosNaming.NameComponent(codeSite, "");
                org.omg.CORBA.Object distantSite = nameRoot.resolve(nameToFind);
                
                this.mesSites[i] = SiteTouristiqueHelper.narrow(distantSite);
                
                /********** Recherche du service E/S du site *********/
                String nomServES = "ES "+ codeSite;
                nameToFind[0] = new org.omg.CosNaming.NameComponent(nomServES, "");
                org.omg.CORBA.Object distantServES = nameRoot.resolve(nameToFind);
                
                this.mesServES[i] = ServiceESSiteHelper.narrow(distantServES);
                i++;
             }
        }
	catch (Exception e) {
	}  
    }
            
    @Override
    public Site[] getListeSitesAVisiter(short[] listeSitesVisites) {
        // récupération des ids des sites à visiter
        short[] idSitesAVisiter;
        if(listeSitesVisites.length != 0)
            //Si les sites ont déjà été visités, récupération des ids de ceux qui restent à visiter
            idSitesAVisiter = this.db.getSitesNonVisites(listeSitesVisites);
        else
            idSitesAVisiter = this.db.getIdSites();
        
        // pour chaque site à visiter, récupération des infos des sites
        Site[] sitesAVisiter = new Site[idSitesAVisiter.length];
        Site infoSite;
        float affluenceCourante;
        
        for(int i=0; i<idSitesAVisiter.length; i++) {  
            infoSite = this.mesSites[i].getInfoSite();
                   
            //Récupération de l'affluence courante auprès du service ES du site
            affluenceCourante = this.mesServES[i].getAffluenceCourante();

            sitesAVisiter[i] = new Site(infoSite.idSite, infoSite.codeSite, infoSite.titre, infoSite.coord, infoSite.horaireOuverture, infoSite.horairesFermeture, infoSite.description, infoSite.adresse, infoSite.telephone, affluenceCourante);
        }
        
        
        return sitesAVisiter; 
    }
   
    
}
