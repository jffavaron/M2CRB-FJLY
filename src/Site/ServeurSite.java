/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;

import java.util.Date;
import org.omg.CosNaming.NamingContext;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 *
 * @author Lydia
 */
public class ServeurSite /*implements Runnable*/ {
    //TODO à récupérer dans la BD
    //public String nomSite;
    
    //public static Coordonnees coordSite = new Coordonnees((float)30, (float)45);

    
    /*public ServeurSite(String nombd, String args[]) {
       this.nombd = nombd;
       this.args = args;
       this.db = new SiteDBManager(this.nombd);
    }*/
    
    public void afficherHoraireFermeture(Date heureF) {
        
    }
    
    public static void main(String args[]) {
    //public void run() {
        String nombd = args[0];
        SiteDBManager db = new SiteDBManager(nombd);
        //String nomSite = db.getNomSite();
        String codeSite = db.getCodeSite();
     /* //Flux E/S standards
     BufferedReader entree_std = new BufferedReader(new InputStreamReader(System.in));
     PrintStream sortie_std = new PrintStream(System.out); */
    
      try {
          //Configuration de base
          //sortie_std.print("Quel est le nom du site?");
          //nomSite=entree_std.readLine();
          
          org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

            // Gestion du POA
             //****************
             // Recuperation du POA
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

            // Creation du servant
            //*********************
           SiteTouristiqueImpl monSite = new SiteTouristiqueImpl(nombd);

            // Activer le servant au sein du POA et recuperer son ID
            byte[] monSiteId = rootPOA.activate_object(monSite);

            // Activer le POA manager
            rootPOA.the_POAManager().activate();

            /******** Enregistrement dans le service de nommage ********/
         
            // Recuperation du naming service
            NamingContext nameRoot=org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));

            // Construction du nom a enregistrer
            org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
            nameToRegister[0] = new org.omg.CosNaming.NameComponent(codeSite,"");

            // Enregistrement de l'objet CORBA dans le service de noms
            nameRoot.rebind(nameToRegister,rootPOA.servant_to_reference(monSite));
            System.out.println("==> Nom '"+ codeSite + "' est enregistre dans le service de noms.");

            String IORServant = orb.object_to_string(rootPOA.servant_to_reference(monSite));
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
