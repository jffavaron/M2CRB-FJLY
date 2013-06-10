/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;

import static Site.ServeurSite.nomSite;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import org.omg.CosNaming.NamingContext;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 *
 * @author Lydia
 */
public class ServeurStatSite {
    //A lire dans la table
    public static String nomServStatSite;
    
    public ServeurStatSite() {
        
    }
    
    public void calculerStats( int[] ListeVisites) {
        
    }
    
    public static void main(String args[]) {
        //TODO à lire dans la table 
        //Tableau des id/nom des sites 
        HashMap<Integer,String> listeSites = new HashMap<Integer, String>();
        listeSites. put(1, "Georges Labit");
        listeSites.put(2,"Museum histoire naturelle");
        listeSites.put(3, "Saint Raymond");
        
        //Flux E/S standards
        BufferedReader entree_std = new BufferedReader(new InputStreamReader(System.in));
        PrintStream sortie_std = new PrintStream(System.out); 

        try {
            //Configuration de base
          sortie_std.print("Quel est le nom du site?"); 
          nomServStatSite="STAT "+entree_std.readLine();
          
        // Intialisation de l'ORB
        //************************
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

        // Gestion du POA
        //****************
        // Recuperation du POA
        POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

        // Creation du servant
        //*********************
        ServiceStatSiteImpl monServiceStatSite = new ServiceStatSiteImpl(orb, listeSites);

        // Activer le servant au sein du POA et recuperer son ID
        byte[] monServiceStatSiteId = rootPOA.activate_object(monServiceStatSite);

        // Activer le POA manager
        rootPOA.the_POAManager().activate();

        /*********** Enregistrement dans le service de nommage ************/
   
        // Recuperation du naming service
        NamingContext nameRoot=org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));

        // Construction du nom a enregistrer
        org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
        nameToRegister[0] = new org.omg.CosNaming.NameComponent(nomServStatSite,"");

        // Enregistrement de l'objet CORBA dans le service de noms
        nameRoot.rebind(nameToRegister,rootPOA.servant_to_reference(monServiceStatSite));
        System.out.println("==> Nom '"+ nomServStatSite + "' est enregistre dans le service de noms.");

        
        String IORServant = orb.object_to_string(rootPOA.servant_to_reference(monServiceStatSite));
        System.out.println("L'objet possede la reference suivante :");
        System.out.println(IORServant);

        // Lancement de l'ORB et mise en attente de requete
        //**************************************************
        orb.run();

    }
	catch (Exception e) {
		e.printStackTrace();
	}

    }
}
