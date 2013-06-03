package AssistanceTouristique;

/**
 * Interface definition : ServiceStatSite
 * 
 * @author OpenORB Compiler
 */
public interface ServiceStatSiteOperations
{
    /**
     * Operation getStatsSite
     */
    public AssistanceTouristique.Statistique[] getStatsSite();

    /**
     * Operation afficherInfosES
     */
    public void afficherInfosES(AssistanceTouristique.Visite[] listeVisites);

}
