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
    static org.omg.CORBA.ORB orb;
    
    static public void init(java.lang.String nommage) {
        try {
           //Initialisation de l'ORB
            System.out.println("init : initialisation de l'ORB");
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init((String[])null, System.getProperties());
            
            //recuperation du POA racine
            POA poaRoot = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            
            // creation de politiques pour un POA persistent
            org.omg.CORBA.Policy[] policies =
            {poaRoot.create_lifespan_policy(LifespanPolicyValue.PERSISTENT) };
            
            // creation de son propre POA avec les politiques precedentes
             POA poaGestionComptes = poaRoot.create_POA(nommage + "_poa", poaRoot.the_POAManager(),policies);
             System.out.println("init : " + nommage +"_poa cree");
             
            // recuperation du naming service
            NamingContext root =
            org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
        
            // construction du nom a enregistrer
            org.omg.CosNaming.NameComponent [] nameToFind = new org.omg.CosNaming.NameComponent[1];
            nameToFind [0] = new org.omg.CosNaming.NameComponent(nommage, " ");
            
            // creation du servant
            ServiceAchatOfficeImpl monServiceAchat = new ServiceAchatOfficeImpl(nommage);
            
            // attribution d'un ID et activation dans le POA
            poaGestionComptes.activate_object_with_id(nommage.getBytes(),monServiceAchat);
            
            // activation du POA manager
            poaRoot.the_POAManager().activate();
            
            // enregistrement dans le service de nommage
            root.rebind(nameToFind, poaGestionComptes.servant_to_reference(monServiceAchat));
            System.out.println("init : enregistrement dans le service de nommage");
            // mise en attente de requetes
            orb.run();
            System.out.println("init : attente de requetes");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public ServiceAchatOfficeImpl(String nom) {
        this.nom = nom;
    }
    
    public Carte acheterPrestation(String dateD, String dateF, float montant) throws 
                AssistanceTouristique.ServiceAchatOfficePackage.achatImpossibleException {
        //Génération d'un numéro de carte aléatoire
        //Construction de la carte
        Carte c = new Carte(Short.parseShort("10"), dateD, dateF);
        return c;
        
    }
}
