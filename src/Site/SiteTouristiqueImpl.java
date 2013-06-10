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
public class SiteTouristiqueImpl extends SiteTouristiquePOA {
    
    public SiteTouristiqueImpl() {
        
    }
    
    //TODO BD
    public short getHorairesFermeture(int idSite) {
        short horaire=0;
        switch(idSite) {
            //Georges LAbit
            case 1 :
                //17h30 en minutes
                horaire=(17*60)+30;
                break;
            //Museum histoire naturelle    
            case 2 :
                //18h en minutes
                horaire=18*60;
                break;
            //Saint Raymond
            case 3 :
                //18h45 en minutes
                horaire=(18*60)+45;
                break;
        }
        return horaire;
        
    }
}
