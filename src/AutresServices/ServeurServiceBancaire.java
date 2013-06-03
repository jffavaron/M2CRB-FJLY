/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AutresServices;

import Office.ServiceAchatOfficeImpl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 * @author Lydia
 */
public class ServeurServiceBancaire {
    private AssistanceTouristique.ServiceBancaire serv;
    
    public ServeurServiceBancaire(AssistanceTouristique.ServiceBancaire serv) {
        this.serv=serv;
    }
    
    public void validerPaiement() {
        
    }
    
    public void refuserPaiement() {
        
    }
    
    public AssistanceTouristique.ServiceBancaire getServiceBancaire() {
        return serv;
    }
    
    public static void main(String args[]) {
        String nom_office;
        
        //Flux E/S standards
        BufferedReader entree_std = new BufferedReader(new InputStreamReader(System.in));
        PrintStream sortie_std = new PrintStream(System.out);
        
        try {
            //System.out.println(System.getProperty("java.home") +java.io.File.separator + "lib");
            //Configuration de base
            sortie_std.print("Quel est le nom de l'office :");
            nom_office = entree_std.readLine();
            
            //1
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
            
            //org.omg.CosNaming.NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
            org.omg.CosNaming.NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(orb.string_to_object("corbaloc:iiop:1.2@127.0.0.1:2001/NameService"));
            //2
            org.omg.PortableServer.POA rootPOA = org.omg.PortableServer.POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            
            //3
            ServiceBancaireImpl monServiceBancaire = new ServiceBancaireImpl();
            
            //4
            rootPOA.activate_object(monServiceBancaire);
            
            //5
            rootPOA.the_POAManager().activate();
            
            //6
            sortie_std.println(orb.object_to_string(rootPOA.servant_to_reference(monServiceBancaire)));
            
            //org.omg.CosNaming.NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
            
            org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
            
            nameToRegister[0] = new org.omg.CosNaming.NameComponent(nom_office,"");
            nameRoot.rebind(nameToRegister, rootPOA.servant_to_reference(monServiceBancaire));
            
            sortie_std.println("Le service bancaire de l'office "+nom_office+" tourne");
            
            //7
            orb.run();  
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
