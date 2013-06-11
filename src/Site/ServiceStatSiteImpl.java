/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;
import AssistanceTouristique.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.omg.CosNaming.NamingContext;
/**
 *
 * @author Lydia
 */
public class ServiceStatSiteImpl extends ServiceStatSitePOA {
    public org.omg.CORBA.ORB orb;
    
    public ServiceStatSiteImpl(org.omg.CORBA.ORB orb, HashMap listeSite) {
        this.orb=orb;
        
        try {
            NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(this.orb.resolve_initial_references("NameService"));
            Set set = listeSite.entrySet();
            Iterator it = set.iterator();
            //Pour chaque site
            while(it.hasNext()) {
                Map.Entry site = (Map.Entry)it.next();
                //Recherche du site
                org.omg.CosNaming.NameComponent[] nameToFind = new org.omg.CosNaming.NameComponent[1];
                nameToFind[0] = new org.omg.CosNaming.NameComponent((String)site.getValue(), "");
                org.omg.CORBA.Object distantServES = nameRoot.resolve(nameToFind);
                
                AssistanceTouristique.ServiceESSite monServES = AssistanceTouristique.ServiceESSiteHelper.narrow(distantServES);
                
                //Appel à la methode du service E/S
                monServES.getInfosES((short)site.getKey());
            }   
        }
	catch (Exception e) {
		e.printStackTrace();
	}  
        
    }
    
    public Statistique[] getStatsSite(String date , short idSite) {
        //Traitement de la date
        DateFormat formater = DateFormat.getDateInstance(DateFormat.SHORT,Locale.ENGLISH);
        try {
            Date dateStat = formater.parse(date);
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        /*Switch(nomSite) {
         * case "museum hostoire naturelle":
         * break;
         * case "Saint Raymond" :
         * break;
         * case "Geeorges Labit" :
         * break;
        }
        */
        
        //-------- TODO corba: contacter ServiceE/S -----------------//
        Statistique[] stat = new Statistique[4];
        stat[0] = new Statistique("Affluence quotidienne", 12, "%");
        stat[1] = new Statistique("Durée moyenne de visite", 120, "minutes");
        stat[2] = new Statistique("Durée minimum de visite", 70, "minutes");
        stat[3] = new Statistique("Durée maximum de visite", 180, "minutes");
        return stat;
        
    }

}
