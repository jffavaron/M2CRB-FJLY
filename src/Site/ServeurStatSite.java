/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;

import org.omg.CosNaming.NamingContext;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 *
 * @author Lydia
 */
public class ServeurStatSite /*implements Runnable */{
    //A lire dans la table
    
   
    //private String args[];
    //private SiteDBManager db;
    
    /*public ServeurStatSite(String nombd, String args[]) {
        this.nombd = nombd;
        this.args = args;
        this.db = new SiteDBManager(this.nombd);
    }*/
    
    public static void main(String args[]) {
   // public void run() {
        String nombd = args[0];
        SiteDBManager db = new SiteDBManager(nombd);
        String nomServStatSite = "STAT "+ db.getCodeSite();
        
        try {
          
        // Intialisation de l'ORB
        //************************
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

        // Gestion du POA
        //****************
        // Recuperation du POA
        POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

        // Creation du servant
        //*********************
        ServiceStatSiteImpl monServiceStatSite = new ServiceStatSiteImpl(orb, db.getIdSite(), db.getCodeSite(), args[0]);

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
