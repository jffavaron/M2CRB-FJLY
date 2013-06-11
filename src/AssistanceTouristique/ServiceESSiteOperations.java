package AssistanceTouristique;

/**
 * Interface definition : ServiceESSite
 * 
 * @author OpenORB Compiler
 */
public interface ServiceESSiteOperations
{
    /**
     * Operation autoriserEntree
     */
    public void autoriserEntree(AssistanceTouristique.Carte carte);

    /**
     * Operation entrer
     */
    public boolean entrer(short idCarte)
        throws AssistanceTouristique.ServiceESSitePackage.carteNonValideException, AssistanceTouristique.ServiceESSitePackage.siteDejaVisiteException, AssistanceTouristique.ServiceESSitePackage.siteSatureException, AssistanceTouristique.ServiceESSitePackage.siteFermeException;

    /**
     * Operation sortir
     */
    public void sortir(short idCarte);

    /**
     * Operation donnerAvisVisite
     */
    public void donnerAvisVisite(String interet);

    /**
     * Operation getInfosES
     */
    public AssistanceTouristique.Visite[] getInfosES(short idSite);

    /**
     * Operation getAffluenceCourante
     */
    public short getAffluenceCourante(short idSite);

}
