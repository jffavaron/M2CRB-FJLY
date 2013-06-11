/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AutresServices;
import AssistanceTouristique.*;

import Office.OfficeImpl;
import static Office.ServeurOffice.nomOffice;
import Office.ServiceAchatOfficeImpl;
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
public class ServeurServiceBancaire {
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
    
    /* public String getNomBanque() {
        return nom_banque;
    }
     
    public void setNomBanque(String nom_banque){
        this.nom_banque = nom_banque;
    }*/
   
    public static void main(String args[]) {
    //public void run() {
        
        try {
           org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

            // Gestion du POA
             //****************
             // Recuperation du POA
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

            // Creation du servant
            //*********************
           ServiceBancaireImpl monServBancaire = new ServiceBancaireImpl();

            // Activer le servant au sein du POA et recuperer son ID
            byte[] monServBancaireId = rootPOA.activate_object(monServBancaire);

            // Activer le POA manager
            rootPOA.the_POAManager().activate();

            /******** Enregistrement dans le service de nommage ********/
         
            // Recuperation du naming service
            NamingContext nameRoot=org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));

            // Construction du nom a enregistrer
            org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
            nameToRegister[0] = new org.omg.CosNaming.NameComponent(nom_banque,"");

            // Enregistrement de l'objet CORBA dans le service de noms
            nameRoot.rebind(nameToRegister,rootPOA.servant_to_reference(monServBancaire));
            System.out.println("==> Nom '"+ nom_banque + "' est enregistre dans le service de noms.");

            String IORServant = orb.object_to_string(rootPOA.servant_to_reference(monServBancaire));
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
