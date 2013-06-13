/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;
import AssistanceTouristique.*;
import AutresServices.ServeurServiceBancaire;

import java.io.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
/**
 *
 * @author Lydia
 */
public class ServiceAchatOfficeImpl extends ServiceAchatOfficePOA {
    private String nom_achat;
    private org.omg.CORBA.ORB orb;
    private ServiceBancaire banque;
    private Office office;
    private Site[] lesSites;
    private ServiceESSite[] lesServES;
    
    public ServiceAchatOfficeImpl(String nom_achat, org.omg.CORBA.ORB orb) {
        this.nom_achat=nom_achat;
        this.orb=orb;
        
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
               
            /************* Recherche de l'office auprès du service de nom *************/
            String nom_office = ServeurOffice.nomOffice;
       
            nameToFind = new org.omg.CosNaming.NameComponent[1];
            nameToFind[0] = new org.omg.CosNaming.NameComponent(nom_office, "");
            org.omg.CORBA.Object distantOffice = nameRoot.resolve(nameToFind);
            System.out.println("Objet "+nom_office+ " trouvé auprès du service de noms.");
            
            this.office = OfficeHelper.narrow(distantOffice);
            //Liste des sites de l'office
            Coordonnees coordOffice = new Coordonnees((float)10, (float)20);
            this.lesSites = this.office.getListeSitesAVisiter((short)0, coordOffice, new short[0]);
            
            String nom_servES;
            lesServES = new ServiceESSite[this.lesSites.length];
            //Pour chaque site
            for(int i=0; i<this.lesSites.length; i++) {
                /************* Recherche des services E/S des sites auprès du service de nom *************/
                nom_servES = "ES " + this.lesSites[i].titre; 
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
    
    public Carte acheterPrestation(String dateD, String dateF, float montant) throws 
                AssistanceTouristique.ServiceAchatOfficePackage.achatImpossibleException {
        //Génération d'un numéro de carte aléatoire
        short idCarte = (short)(Math.random() * 1000 + 1);
        
        //Construction de la carte
        Carte c = new Carte(idCarte, dateD, dateF);
        try {
            Boolean autorisation = this.banque.verifierPaiement(montant);
            if(autorisation) {
                //Pour chaque service ES
                for(int i=0; i<this.lesServES.length; i++) {
                    //Envoi de la carte au service
                    this.lesServES[i].autoriserEntree(Smartphone.ClientSmartphone.carte);
                }
            }   
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return c;
        
    }
}
