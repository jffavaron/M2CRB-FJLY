package AssistanceTouristique;

/**
 * Interface definition : ServiceDeplacement
 * 
 * @author OpenORB Compiler
 */
public interface ServiceDeplacementOperations
{
    /**
     * Operation calculerDureeTrajet
     */
    public float calculerDureeTrajet(AssistanceTouristique.Coordonnees coordGPS_A, AssistanceTouristique.Coordonnees coordGPS_B, String mode);

}
