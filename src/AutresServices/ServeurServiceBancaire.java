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
    private AssistanceTouristique.ServiceBancaire monServBancaire;
    private AssistanceTouristique.ServiceAchatOffice serv_achat;
    public static String nom_banque = "bnp";
    /*private BufferedReader entree_std;
    private PrintStream sortie_std;
    private org.omg.CORBA.ORB orb;*/
    
    /*public ServeurServiceBancaire(String nom_banque ) {
        this.entree_std=entree_std;
        this.sortie_std=sortie_std;
        this.orb=orb;
        this.serv_achat=serv_achat;
        this.nom_banque=nom_banque;
    }
    
    public ServeurServiceBancaire() {
    }*/
    
    public void validerPaiement() {
        System.out.println("Le paiement est accepté");
    }
    
    public void refuserPaiement() {
        
    }
    
    public AssistanceTouristique.ServiceBancaire getServiceBancaire() {
        return monServBancaire;
    }
    
    /* public String getNomBanque() {
        return nom_banque;
    }
     
    public void setNomBanque(String nom_banque){
        this.nom_banque = nom_banque;
    }*/
   
    public static void main(String args[]) {
    //public void run() {
        
        //Flux E/S standards
        BufferedReader entree_std = new BufferedReader(new InputStreamReader(System.in));
        PrintStream sortie_std = new PrintStream(System.out);
        
        try {
            //System.out.println(System.getProperty("java.home") +java.io.File.separator + "lib");
            //Configuration de base
            //sortie_std.print("Quel est le nom de la banque :");
            //nom_banque = entree_std.readLine();
            //Appel au constructeur pour enregistrer le nom du service bancaire
            //ServeurServiceBancaire serv = new ServeurServiceBancaire(entree_std.readLine());
            //nom=serv.getNomBanque();
    
            //1
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
            
            org.omg.CosNaming.NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
            //org.omg.CosNaming.NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(orb.string_to_object("corbaloc:iiop:1.2@127.0.0.1:2001/NameService"));
            
            //2
            org.omg.PortableServer.POA rootPOA = org.omg.PortableServer.POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            
            //3
            ServiceBancaireImpl monServiceBancaire = new ServiceBancaireImpl(sortie_std);
            
            //4
            rootPOA.activate_object(monServiceBancaire);
            
            //5
            rootPOA.the_POAManager().activate();
            
            //6
            sortie_std.println(orb.object_to_string(rootPOA.servant_to_reference(monServiceBancaire)));
            
            //org.omg.CosNaming.NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
            
            org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
            nameToRegister[0] = new org.omg.CosNaming.NameComponent(nom_banque,"");
            nameRoot.rebind(nameToRegister, rootPOA.servant_to_reference(monServiceBancaire));
            
            /*this.serv=AssistanceTouristique.ServiceBancaireHelper.narrow(rootPOA.servant_to_reference(monServiceBancaire));
            sortie_std.println("Le serveur bancaire est actif");*/
            
            sortie_std.println("Le service de la banque "+nom_banque+" tourne");
            
            //7
            orb.run();  
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
