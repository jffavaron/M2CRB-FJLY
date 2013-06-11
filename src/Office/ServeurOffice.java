/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;

import java.util.HashMap;
import org.omg.CosNaming.NamingContext;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 *
 * @author Lydia
 */
public class ServeurOffice {
    public static String nomOffice="Toulouse";
    
    
    public void calculerSitesNonVisites(int[] listeSitesVisites ) {
        
    }
    
    public void calculerSitesProches(int Coord) {
        
    }
    
    public void afficherListeSiteAVisiter(int[] listeSitesAVister) {
        
    }
    
    public static void main(String args[]) {
        //Tableau des id/nom des sites
        //Tableau des id/nom des sites 
        HashMap<Short,String> listeSites = new HashMap<Short, String>();
        listeSites. put((short)1, "Georges Labit");
        listeSites.put((short)2,"Museum histoire naturelle");
        listeSites.put((short)3, "Saint Raymond");
        
        try {
           org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

            // Gestion du POA
             //****************
             // Recuperation du POA
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

            // Creation du servant
            //*********************
           OfficeImpl monOffice = new OfficeImpl(orb, listeSites);

            // Activer le servant au sein du POA et recuperer son ID
            byte[] monOfficeId = rootPOA.activate_object(monOffice);

            // Activer le POA manager
            rootPOA.the_POAManager().activate();

            /******** Enregistrement dans le service de nommage ********/
         
            // Recuperation du naming service
            NamingContext nameRoot=org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));

            // Construction du nom a enregistrer
            org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
            nameToRegister[0] = new org.omg.CosNaming.NameComponent(nomOffice,"");

            // Enregistrement de l'objet CORBA dans le service de noms
            nameRoot.rebind(nameToRegister,rootPOA.servant_to_reference(monOffice));
            System.out.println("==> Nom '"+ nomOffice + "' est enregistre dans le service de noms.");

            String IORServant = orb.object_to_string(rootPOA.servant_to_reference(monOffice));
            System.out.println("L'objet possede la reference suivante :");
            System.out.println(IORServant);

            // Lancement de l'ORB et mise en attente de requete
            //**************************************************
            orb.run();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
