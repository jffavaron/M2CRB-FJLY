package AssistanceTouristique;

/**
 * Interface definition : ServiceStatOffice
 * 
 * @author OpenORB Compiler
 */
public interface ServiceStatOfficeOperations
{
    /**
     * Operation getStatsGlobales
     */
    public AssistanceTouristique.Statistique[] getStatsGlobales();

    /**
     * Operation afficherStatsSite
     */
    public void afficherStatsSite(AssistanceTouristique.Statistique[] listeStat);

}
