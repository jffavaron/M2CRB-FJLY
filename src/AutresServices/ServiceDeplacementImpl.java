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
public class ServiceDeplacementImpl extends ServiceDeplacementPOA {
    
    public ServiceDeplacementImpl() {
        
    }
    
    public float calculerDureeTrajet(Coordonnees coordGPS_A, Coordonnees coordGPS_B, String mode) {
        float duree = 0; 
          
        // calcul de la distance entre A et B en mètres 
        double earthRadius = 3958.75; 
        double dLat = Math.toRadians(coordGPS_B.latitude-coordGPS_A.latitude); 
        double dLng = Math.toRadians(coordGPS_B.longitude-coordGPS_A.longitude); 
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) + 
                   Math.cos(Math.toRadians(coordGPS_A.latitude)) * Math.cos(Math.toRadians(coordGPS_B.latitude)) * 
                   Math.sin(dLng/2) * Math.sin(dLng/2); 
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
        double dist = earthRadius * c; 
        int meterConversion = 1609; 
        double distance = dist * meterConversion; 
          
        // calcul de la durée en fonction de la distance et du mode de déplacement 
        switch(mode){ 
        case "voiture": 
            duree = (float) (distance / 1000 * 3); 
            break; 
        case "transports commun": 
            duree = (float) (distance / 1000 * 4); 
            break; 
        case "vélo": 
            duree = (float) (distance / 1000 * 5); 
            break; 
        case "piéton": 
            duree = (float) (distance / 1000 * 15); 
            break; 
        } 
          
        return duree; 
    }
       
}
