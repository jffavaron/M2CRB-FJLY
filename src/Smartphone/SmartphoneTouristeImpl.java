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
    
    public void notifierAvisVisite(int idVisite, String codeSite) {
        // TODO afficher saisie de l'avis
        ServeurSmartphone2 servSmartphone = new ServeurSmartphone2(idVisite, codeSite);
        //Appel à l'interface graphique
        servSmartphone.afficherInterfaceAvis();
    }

    public short idCarteAchetee() {
        return this.idCarte;
    }
  
}
