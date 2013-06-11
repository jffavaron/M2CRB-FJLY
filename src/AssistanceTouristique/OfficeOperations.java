package AssistanceTouristique;

/**
 * Interface definition : Office
 * 
 * @author OpenORB Compiler
 */
public interface OfficeOperations
{
    /**
     * Operation getListeSitesAVisiter
     */
    public AssistanceTouristique.Site[] getListeSitesAVisiter(short idCarte, AssistanceTouristique.Coordonnees coordGPS, short[] listeIdSitesVisites);

}
