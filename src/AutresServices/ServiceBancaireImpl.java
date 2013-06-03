/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AutresServices;
import AssistanceTouristique.*;
/**
 *
 * @author Lydia
 */
public class ServiceBancaireImpl extends ServiceBancairePOA {
    
    public ServiceBancaireImpl() {
    }
    
    public boolean verifierPaiement(float montant) {
        if(montant>0)   
            return true;
        return true;   
    }
}
