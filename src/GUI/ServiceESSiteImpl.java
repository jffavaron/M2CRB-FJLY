/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import GestionAssitanceTouristique.*;
/**
 *
 * @author Lydia
 */
public abstract class ServiceESSiteImpl extends ServiceESSitePOA {
 
    public ServiceESSiteImpl() {
        
    }
    
    public void autoriserEntree(Carte carte) {
        
    }
    
    public boolean entrer(short idCarte) throws GestionAssitanceTouristique.ServiceESSitePackage.carteNonValideException, 
                                                GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteException, 
                                                GestionAssitanceTouristique.ServiceESSitePackage.siteSatureException, 
                                                GestionAssitanceTouristique.ServiceESSitePackage.siteFermeException {
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
