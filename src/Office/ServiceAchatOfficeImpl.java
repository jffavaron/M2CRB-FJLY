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
            System.out.println("Objet "+nom_banque); 
            org.omg.CORBA.Object distantBanque = nameRoot.resolve(nameToFind);
            System.out.println("Objet "+nom_banque+ " trouvé auprès du service de noms.");
            
            this.banque = ServiceBancaireHelper.narrow(distantBanque);
               
            
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
            this.banque.verifierPaiement(montant);
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return c;
        
    }
}
