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
    private ServiceESSite[] monServES;
    private OfficeDBManager db;
    //private NamingContext nameRoot;
    
    public OfficeImpl(org.omg.CORBA.ORB orb, /*short[] listeSite*/ Hashtable<Short, String> listeSite) {
        this.orb=orb;
        this.listeSite=listeSite;
        //this.nb_sites=this.listeSite.length;
        this.nb_sites=this.listeSite.size();
        this.mesSites = new SiteTouristique[this.nb_sites];
        this.monServES = new ServiceESSite[this.nb_sites];
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
                
                this.monServES[i] = ServiceESSiteHelper.narrow(distantServES);
                i++;
             }
        }
	catch (Exception e) {
	}  
    }
            
    @Override
    public Site[] getListeSitesAVisiter(short idCarte, Coordonnees coordGPS, short[] listeSitesVisites) {
        //ServeurOffice servOffice = new ServeurOffice(this.nombd);
        // récupération des ids des sites à visiter
        short[] idSites = this.db.getIdSites();
        
        // pour chaque site à visiter, récupération des infos des sites
        Site[] sitesAVisiter = null;
        /*for(int j=0; j<this.listeSite.length; j++) {  
            // TODO !!! + affluence courante
            /*Site = infoSite = this.monSite.getInfoSite(this.listeSite[j]);
                   
            //Récupération de l'affluence courante auprès du service ES du site
            //affluenceCourante = this.monServES.getAffluenceCourante((short)site.getKey());

            affluenceCourante = (float)12.3;

            siteAVisiter[i] = new Site(infoSite.idSite, infoSite.titre, infoSite.coord, infoSite.horaireOuverture, infoSite.horairesFermeture, infoSite.description, infoSite.adresse, infoSite.telephone, affluenceCourante);
            i++;*/
        //}
            //}
        
        
        return sitesAVisiter; 
    }
    
    /*public void enregistrerSiteVersOffice(Site s) {
        try {
            // Construction du nom a enregistrer
            org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
            nameToRegister[0] = new org.omg.CosNaming.NameComponent(nomOffice,"");

            // Enregistrement de l'objet CORBA dans le service de noms
            nameRoot.rebind(nameToRegister,rootPOA.servant_to_reference(monOffice));
            System.out.println("==> Nom '"+ nomOffice + "' est enregistre dans le service de noms.");

            String IORServant = orb.object_to_string(rootPOA.servant_to_reference(monOffice));
            System.out.println("L'objet possede la reference suivante :");
            System.out.println(IORServant);
         }
	catch (Exception e) {
		e.printStackTrace();
	}   
            
    }*/
    
}
