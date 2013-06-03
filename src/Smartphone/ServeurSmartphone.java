/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Smartphone;

import org.omg.CosNaming.*;
import org.omg.PortableServer.*;
/**
 *
 * @author Lydia
 */
public class ServeurSmartphone implements Runnable {
    private org.omg.CORBA.ORB orb;
    private AssistanceTouristique.SmartphoneTouriste smartphone;
    
    public ServeurSmartphone(org.omg.CORBA.ORB orb) {
        this.orb=orb; 
    }
    
     public void enregistrerVisite(int idSite) {
        
     }
   
     public void run() {
         try {
            //1 
             org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
             
             /****** Gestion du POA ******/
             //2
             POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
             
             //3
             SmartphoneTouristeImpl monSmartphone = new SmartphoneTouristeImpl();
             
             //4
             byte[] monSmartphoneId = rootPOA.activate_object(monSmartphone);
             
             //5
             rootPOA.the_POAManager().activate();
             
             //6 Recuperation du naming service
             NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
             
             //Construction du nom a enregistrer
             org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
             
             nameToRegister[0] = new org.omg.CosNaming.NameComponent("MonSmatphone", "");
             
             //Enregistrement du nom de l'objet corba dans le service de nom
             nameRoot.rebind(nameToRegister, rootPOA.servant_to_reference(monSmartphone));
             
             //7
             orb.run();      
         }
         catch(Exception e) {
             
         }
    }
}
