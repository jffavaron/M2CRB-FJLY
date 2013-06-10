/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AutresServices;
import AssistanceTouristique.*;
import java.io.*;
/**
 *
 * @author Lydia
 */
public class ServiceBancaireImpl extends ServiceBancairePOA {
    private PrintStream sortie_std;
    
    public ServiceBancaireImpl(PrintStream sortie_std) {
        this.sortie_std=sortie_std;
    }
    
    public boolean verifierPaiement(float montant) throws AssistanceTouristique.ServiceBancairePackage.operationImpossibleException {
        boolean retour=false;
        if(montant>0)  {
            retour=true;
        }  
        else {
            throw new AssistanceTouristique.ServiceBancairePackage.operationImpossibleException("Montant négatif");   
        }
        return retour;
}   }
