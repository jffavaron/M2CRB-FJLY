/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;
import AssistanceTouristique.*;
import org.omg.CosNaming.NamingContext;
/**
 *
 * @author Lydia
 */
public class ServiceStatOfficeImpl extends ServiceStatOfficePOA {
    private String nomServStat;
    private org.omg.CORBA.ORB orb;
    private Office monOffice;
    private Site[] lesSites;
    private ServiceStatSite[] lesServStat;
    
    public ServiceStatOfficeImpl(String nom_servStat, org.omg.CORBA.ORB orb) {

        this.nomServStat=nom_servStat;
        this.orb=orb;
        try {
            NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(this.orb.resolve_initial_references("NameService"));
             /*********** Recherche de l'office ***********/
             String nom_office = ServeurOffice.nomOffice;
             org.omg.CosNaming.NameComponent[] nameToFind = new org.omg.CosNaming.NameComponent[1];
             nameToFind[0] = new org.omg.CosNaming.NameComponent(nom_office, "");
             org.omg.CORBA.Object distantOffice = nameRoot.resolve(nameToFind);

             this.monOffice = OfficeHelper.narrow(distantOffice);
             
            //Liste des sites de l'office
            Coordonnees coordOffice = new Coordonnees((float)10, (float)20);
            this.lesSites = this.monOffice.getListeSitesAVisiter((short)0, coordOffice, new short[0]);
            
            String nom_servES;
            lesServStat = new ServiceStatSite[this.lesSites.length];
            //Pour chaque site
            for(int i=0; i<this.lesSites.length; i++) {
                /************* Recherche des services stat des sites auprès du service de nom *************/
                nom_servStat = "STAT " + this.lesSites[i].titre; 
                nameToFind = new org.omg.CosNaming.NameComponent[1];
                nameToFind[0] = new org.omg.CosNaming.NameComponent(nom_servStat, "");
                org.omg.CORBA.Object distantServStat = nameRoot.resolve(nameToFind);
                System.out.println("Objet "+nom_servStat+ " trouvé auprès du service de noms.");

                lesServStat[i] = ServiceStatSiteHelper.narrow(distantServStat);  
            }
            
        }
	catch (Exception e) {
		e.printStackTrace();
	}

        
    }
    
    //TODO
    public Statistique[] getStatsGlobales() {
        Statistique[] statGlobal = new Statistique[this.lesServStat.length];
        //statGlobal[0] =
        /*Statistique[] statSite = new Statistique[1];
        int[][] stat = new int[this.lesServStat.length][statSite.length];
        
        //Initialisation du tableau
        for(int i=0; i<this.lesServStat.length; i++) 
            for(int j=0; j<statSite.length; j++) 
                stat[i][j] = 0;
 
        
        //Pour chaque service stat des sites
        for(int i=0; i<this.lesServStat.length; i++) {
            //Récupération des statistiques du site
            statSite = this.lesServStat[i].getStatsSite("", this.lesSites[i].idSite);
            //Pour chaque statistique
            for(int j=0; j<statSite.length; j++) {
                stat[i][j] += statSite[j].valeurStat;
            }
        }*/
       
       return statGlobal; 
    }
    
}
