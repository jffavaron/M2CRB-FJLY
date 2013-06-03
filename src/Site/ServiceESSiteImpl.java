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
 
    public ServiceESSiteImpl() {
        
    }
    
    public void autoriserEntree(Carte carte) {
        
    }
    
    public boolean entrer(short idCarte) throws AssistanceTouristique.ServiceESSitePackage.carteNonValideException, 
                                                AssistanceTouristique.ServiceESSitePackage.siteDejaVisiteException, 
                                                AssistanceTouristique.ServiceESSitePackage.siteSatureException, 
                                                AssistanceTouristique.ServiceESSitePackage.siteFermeException {
        return false;
      
    }
    
    //Methode oneway
    public void sortir(short idCarte) {
    
    }
    
    //Methode oneway
    public void donnerAvisVisite(String interet) {
        
    }
    
    public Visite[] getInfosES() {
        return null;
        
    }
    
    public short getAffluenceCourante() {
        return 0;
        
    }
    
}
