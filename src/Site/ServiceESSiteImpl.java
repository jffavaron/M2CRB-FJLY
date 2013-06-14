/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;
import AssistanceTouristique.*;
import AssistanceTouristique.ServiceESSitePackage.carteNonValideException;
/**
 *
 * @author Lydia
 */
public class ServiceESSiteImpl extends ServiceESSitePOA {
 
    private String nombd;
    private SiteDBManager db;
    
    public ServiceESSiteImpl(String nombd) {
        this.nombd = nombd;
        this.db = new SiteDBManager(this.nombd);
    }
   
    // enregistrement de la carte sur le site
    public void autoriserEntree(Carte carte) {
        this.db.autoriserEntree(carte.idCarte, carte.dateDebut, carte.dateFin);
    }
    
    // revoie vrai si l'entrée est valide, faux sinon
    // TODO gérer exception
    public boolean entrer(short idCarte) throws carteNonValideException{
        boolean estAutorise = this.db.estAutoriseeEntree(idCarte);
        ////throw new carteNonValideException();    // pour lever l'exception
        return estAutorise;      
    }
    
    //Methode oneway
    public void sortir(short idVisite) {
        this.db.finirVisite(idVisite);
    }
        
    //Methode oneway
    public void donnerAvisVisite(Visite visite, float satisfaction) {
        this.db.setTauxSatisfactionVisite(visite.idVisite, satisfaction);
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
