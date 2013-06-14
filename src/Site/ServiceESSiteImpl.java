/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;
import AssistanceTouristique.*;
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
    
    public void autoriserEntree(Carte carte) {
        
    }
    
    public boolean entrer(short idCarte) throws AssistanceTouristique.ServiceESSitePackage.carteNonValideException {
        return false;
      
    }
    
    //Methode oneway
    public void sortir(short idVisite) {
    
    }
    
    //Methode oneway
    public void donnerAvisVisite(Visite visite, float satisfaction) {
        
    }
    
    public float getAffluenceCourante() {
        float affluenceCourante=0;
        
        return affluenceCourante;
    }

    public float getTauxSatisfaction(short idSite) {
        return ((float) 12.5);
    }

    public boolean generateEstFavoris() {
        return true;
    }
    
    public float generateAffluenceQuotidienne() {
        return 0;
    }
    
    public String generateDureeMoyenneVisite() {
        return "durée moyenne";
    }
    
    public String generateDureeMinimaleVisite() {
        return "duréemini";
    }
    
    public String generateDureeMaximaleVisite() {
        return "duréemaxi";
    }
    
    public float generateTauxSatisfaction() {
        return 0;
    }
                
    
}
