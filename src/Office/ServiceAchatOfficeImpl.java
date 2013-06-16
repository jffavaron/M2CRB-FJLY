/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;
import AssistanceTouristique.*;
import AutresServices.ServeurServiceBancaire;

import org.omg.CosNaming.*;
/**
 *
 * @author Lydia
 */
public class ServiceAchatOfficeImpl extends ServiceAchatOfficePOA {
    private String nom_achat;
    private org.omg.CORBA.ORB orb;
    private ServiceBancaire banque;
    private Office office;
    private short[] lesIdSite;
    private ServiceESSite[] lesServES;
    private OfficeDBManager db;
    
    public ServiceAchatOfficeImpl(String nom_achat, org.omg.CORBA.ORB orb) {
        this.nom_achat=nom_achat;
        this.orb=orb;
        this.db = new OfficeDBManager();
        
        //recherche banque auprès du naming service
        try {
            NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(this.orb.resolve_initial_references("NameService"));
            /************* Recherche de la banque auprès du service de nom *************/
            String nom_banque = ServeurServiceBancaire.nom_banque;
            org.omg.CosNaming.NameComponent[] nameToFind = new org.omg.CosNaming.NameComponent[1];
            nameToFind[0] = new org.omg.CosNaming.NameComponent(nom_banque, "");
            org.omg.CORBA.Object distantBanque = nameRoot.resolve(nameToFind);
            System.out.println("Objet "+nom_banque+ " trouvé auprès du service de noms.");
            
            this.banque = ServiceBancaireHelper.narrow(distantBanque);
            
            //Récupération des sites dans la base de l'office
            this.lesIdSite = this.db.getIdSites();

            /************* Recherche des services E/S des sites auprès du service de nom *************/
            String nom_servES;
            lesServES = new ServiceESSite[this.lesIdSite.length];
            //Pour chaque site
            for(int i=0; i<this.lesIdSite.length; i++) {

                nom_servES = "ES " + this.db.getCodeSite(lesIdSite[i]); 
                nameToFind = new org.omg.CosNaming.NameComponent[1];
                nameToFind[0] = new org.omg.CosNaming.NameComponent(nom_servES, "");
                org.omg.CORBA.Object distantServES = nameRoot.resolve(nameToFind);
                System.out.println("Objet "+nom_servES+ " trouvé auprès du service de noms.");

                lesServES[i] = ServiceESSiteHelper.narrow(distantServES);   
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
    
    public Carte acheterPrestation(String dateD, String dateF, float montant) {
        //Génération d'un numéro de carte aléatoire
        short idCarte = (short)(Math.random() * 15 + 1);
        
        //Construction de la carte
        Carte c = new Carte(idCarte, dateD, dateF);
        try {
            Boolean autorisation = this.banque.verifierPaiement(montant);
            if(autorisation) {
                //Pour chaque service ES
                for(int i=0; i<this.lesServES.length; i++) {
                    //Envoi de la carte au service
                    this.lesServES[i].autoriserEntree(c);
                }
            }   
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return c;
        
    }
}
