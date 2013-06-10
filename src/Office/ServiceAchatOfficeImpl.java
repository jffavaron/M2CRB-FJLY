/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;
import AssistanceTouristique.*;

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
    private Short dd;
    private Short df;
    private float montant;
    private String nom;
    
    private String nom_achat;
    private String nom_banque;
    private org.omg.CosNaming.NamingContext naming;
    private org.omg.CORBA.ORB orb;
    private ServiceBancaire banque;
    
    public ServiceAchatOfficeImpl(String nom_achat, String nom_banque, org.omg.CosNaming.NamingContext naming, org.omg.CORBA.ORB orb) {
        this.naming=naming;
        this.nom_achat=nom_achat;
        this.nom_banque=nom_banque;
        this.orb=orb;
        
        //recherche banque auprès du naming service
        try {
            org.omg.CosNaming.NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(orb.string_to_object("corbaloc:iiop:1.2@127.0.0.1:2001/NameService"));
            // construction du nom a enregistrer
            org.omg.CosNaming.NameComponent [] nameToFind = new org.omg.CosNaming.NameComponent[1];
            nameToFind [0] = new org.omg.CosNaming.NameComponent(nom_banque, " ");
            System.out.println("Objet "+nom_banque);
            
            org.omg.CORBA.Object distantServBancaire = nameRoot.resolve(nameToFind);
            //this.banque = AssistanceTouristique.ServiceBancaireHelper.narrow(distantServBancaire);
            System.out.println("Objet "+nom_banque+ "trouvé auprès du service de noms.");
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
    
    public Carte acheterPrestation(String dateD, String dateF, float montant) throws 
                AssistanceTouristique.ServiceAchatOfficePackage.achatImpossibleException {
        //Génération d'un numéro de carte aléatoire
        //Construction de la carte
        Carte c = new Carte(Short.parseShort("10"), dateD, dateF);
        try {
            this.banque.verifierPaiement(montant);
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return c;
        
    }
}
