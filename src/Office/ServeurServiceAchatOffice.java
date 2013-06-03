/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;
import java.io.*;

/**
 *
 * @author Lydia
 */
public class ServeurServiceAchatOffice {
    private AssistanceTouristique.ServiceAchatOffice serviceAchat;
    private String dd, df;
    private float montant;
    
    public ServeurServiceAchatOffice(AssistanceTouristique.ServiceAchatOffice serv, String dd, String df, float montant) {
       this.serviceAchat=serv;
       this.dd = dd;
       this.df = df;
    }
    
    
    public void envoyerCarteElectronique(int idCarte) {
        
    }
    
    public void annulerAchat() {
        
    }
    
    public AssistanceTouristique.ServiceAchatOffice getServiceAchat() {
        return serviceAchat;
    }
    
    public static void main(String[] args) {
        String nom_office;
        
        //Flux E/S standards
        BufferedReader entree_std = new BufferedReader(new InputStreamReader(System.in));
        PrintStream sortie_std = new PrintStream(System.out);
        
        try {
            System.out.println(System.getProperty("java.home") +java.io.File.separator + "lib");
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
            ServiceAchatOfficeImpl monServiceAchat = new ServiceAchatOfficeImpl(nom_office);
            
            //4
            rootPOA.activate_object(monServiceAchat);
            
            //5
            rootPOA.the_POAManager().activate();
            
            //6
            sortie_std.println(orb.object_to_string(rootPOA.servant_to_reference(monServiceAchat)));
            
            //org.omg.CosNaming.NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
            
            org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
            
            nameToRegister[0] = new org.omg.CosNaming.NameComponent(nom_office,"");
            nameRoot.rebind(nameToRegister, rootPOA.servant_to_reference(monServiceAchat));
            
            sortie_std.println("Le service achat de l'office "+nom_office+" tourne");
            
            //7
            orb.run();  
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
