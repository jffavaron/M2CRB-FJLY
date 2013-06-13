/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;

import AssistanceTouristique.*;
import static Site.ServeurSite.nomBD;
import static Site.ServeurSite.nomSite;
import Site.SiteDBManager;
import Site.SiteTouristiqueImpl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import org.omg.CosNaming.NamingContext;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 *
 * @author Lydia
 */
public class ServeurStatOffice implements Runnable {
    
    public static String nomServStatOffice;
    private static String args[];
    
    public ServeurStatOffice(String args[]) {
        this.args=args;
    }
    
    public void calculerStatsGlobales(int[] listeStats) {
        
    }
    
    //public static void main(String args[]) {
    public void run() {
      try {
          nomServStatOffice="STAT " + ServeurOffice.nomOffice;
          
          org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

            // Gestion du POA
             //****************
             // Recuperation du POA
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

            // Creation du servant
            //*********************
           ServiceStatOfficeImpl monServStatOffice = new ServiceStatOfficeImpl(nomServStatOffice, orb);

            // Activer le servant au sein du POA et recuperer son ID
            byte[] monServStatOfficeId = rootPOA.activate_object(monServStatOffice);

            // Activer le POA manager
            rootPOA.the_POAManager().activate();

            /******** Enregistrement dans le service de nommage ********/
         
            // Recuperation du naming service
            NamingContext nameRoot=org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));

            // Construction du nom a enregistrer
            org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
            nameToRegister[0] = new org.omg.CosNaming.NameComponent(nomServStatOffice,"");

            // Enregistrement de l'objet CORBA dans le service de noms
            nameRoot.rebind(nameToRegister,rootPOA.servant_to_reference(monServStatOffice));
            System.out.println("==> Nom '"+ nomServStatOffice + "' est enregistre dans le service de noms.");

            String IORServant = orb.object_to_string(rootPOA.servant_to_reference(monServStatOffice));
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
