/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Smartphone;
import AssistanceTouristique.*;
/**
 *
 * @author Lydia
 */
public class SmartphoneTouristeImpl extends SmartphoneTouristePOA {
    
    //readonly attribute
    private short idCarte;
    
    public SmartphoneTouristeImpl() {
        
    }
    
    public void notifierAvisVisite(Visite visite, Site site) {
        
    }

    public short idCarteAchetee() {
        return this.idCarte;
    }
  
}
