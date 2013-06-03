/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;

import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 *
 * @author Lydia
 */
public class ServeurOffice {
    
    
    public void calculerSitesNonVisites(int[] listeSitesVisites ) {
        
    }
    
    public void calculerSitesProches(int Coord) {
        
    }
    
    public void afficherListeSiteAVisiter(int[] listeSitesAVister) {
        
    }
    
    public static void main(String args[]) {
        try {
           org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
           
           // Gestion du POA
        //****************
        // Recuperation du POA
        POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

        // Creation du servant
        //*********************
       OfficeImpl monOffice = new OfficeImpl();

        // Activer le servant au sein du POA et recuperer son ID
        byte[] monEuroId = rootPOA.activate_object(monOffice);

        // Activer le POA manager
        rootPOA.the_POAManager().activate();

/*
        // Enregistrement dans le service de nommage
        //*******************************************
        // Recuperation du naming service
        NamingContext nameRoot=org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));

        // Construction du nom a enregistrer
        org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
        System.out.println("Sous quel nom voulez-vous enregistrer l'objet Corba ?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String nomObj = in.readLine();
        nameToRegister[0] = new org.omg.CosNaming.NameComponent(nomObj,"");

        // Enregistrement de l'objet CORBA dans le service de noms
        nameRoot.rebind(nameToRegister,rootPOA.servant_to_reference(monEuro));
        System.out.println("==> Nom '"+ nomObj + "' est enregistre dans le service de noms.");
*/
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
