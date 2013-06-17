/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;
import AssistanceTouristique.*;
import AssistanceTouristique.ServiceESSitePackage.carteNonValideException;
import org.omg.CosNaming.NamingContext;
import Smartphone.*;
/**
 *
 * @author Lydia
 */
public class ServiceESSiteImpl extends ServiceESSitePOA {
 
    private String nombd;
    private SiteDBManager db;
    private org.omg.CORBA.ORB orb;
    private SmartphoneTouriste monSmartphone;
    
    public ServiceESSiteImpl(String nombd, org.omg.CORBA.ORB orb) {
        this.nombd = nombd;
        this.db = new SiteDBManager(this.nombd);
        this.orb = orb;
        
        
        try {
            /******************* Recherche du smartphone auprès du naming service **************/
            NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(this.orb.resolve_initial_references("NameService"));
            /************* Recherche de la banque auprès du service de nom *************/
            String nom_smartphone = ServeurSmartphone2.nomSmartphone;
            org.omg.CosNaming.NameComponent[] nameToFind = new org.omg.CosNaming.NameComponent[1];
            nameToFind[0] = new org.omg.CosNaming.NameComponent(nom_smartphone, "");
            org.omg.CORBA.Object distantSmartphone = nameRoot.resolve(nameToFind);
            System.out.println("Objet "+nom_smartphone+ " trouvé auprès du service de noms.");
            
            this.monSmartphone = SmartphoneTouristeHelper.narrow(distantSmartphone);
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
   
    // enregistrement de la carte sur le site
    public void autoriserEntree(Carte carte) {
        this.db.autoriserEntree(carte.idCarte, carte.dateDebut, carte.dateFin);
    }
    
    // revoie vrai si l'entrée est valide, faux sinon
    // TODO gérer exception
    //TODO renvoyer l'id de la visite
    public short entrer(short idCarte) throws carteNonValideException {
        boolean estAutorise = this.db.estAutoriseeEntree(idCarte);
        
        System.out.println("estAutorise: " + estAutorise);
        short idVisite=0;
        if(estAutorise) {
            idVisite = this.db.debuterVisite(idCarte);  
        }
        ////throw new carteNonValideException();    // pour lever l'exception
        return idVisite;      
    }
    
    //Methode oneway
    public void sortir(short idVisite) {
        this.db.finirVisite(idVisite);
        //Affichage de la notification de l'avis sur le smartphone
        this.monSmartphone.notifierAvisVisite(idVisite, this.db.getCodeSite());
    }
        
    //Methode oneway
    public void donnerAvisVisite(int idVisite, float satisfaction) {
        this.db.setTauxSatisfactionVisite(idVisite, satisfaction);
    }   
    
    public float getAffluenceCourante() {
        float affluenceCourante = 0;
        affluenceCourante = this.db.getAffluenceCouranteSite();
        return affluenceCourante;
    }
    
    public float generateAffluenceQuotidienne() {
        float affluenceQuotidienne;
        affluenceQuotidienne = this.db.getAffluenceQuotidienneSite();
        return affluenceQuotidienne;
    }
       
    public String generateDureeMoyenneVisite(){
        String dureeMoy;
        dureeMoy = this.db.generateDureeMoyenneVisiteSite();
        return dureeMoy;
    }
    
    public String generateDureeMinimaleVisite(){
        String dureeMin;
        dureeMin = this.db.generateDureeMinimaleVisiteSite();
        return dureeMin;
    }
    
    public String generateDureeMaximaleVisite(){
        String dureeMax;
        dureeMax = this.db.generateDureeMaximaleVisiteSite();
        return dureeMax;
    }    
    
    public float generateTauxSatisfaction() {
        float tauxSatisfaction;
        tauxSatisfaction = this.db.generateTauxSatisfactionGlobal();
        return tauxSatisfaction;
    }
    
    public boolean generateEstFavoris(){
        boolean estFavori;
        estFavori = this.db.generateEstFavori();
        return estFavori;
    };
}
