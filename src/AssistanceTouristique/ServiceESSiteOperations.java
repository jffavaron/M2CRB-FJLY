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
        throws AssistanceTouristique.ServiceESSitePackage.carteNonValideException;

    /**
     * Operation sortir
     */
    public void sortir(short idVisite);

    /**
     * Operation donnerAvisVisite
     */
    public void donnerAvisVisite(AssistanceTouristique.Visite visite, float satisfaction);

    /**
     * Operation getAffluenceCourante
     */
    public float getAffluenceCourante();

    /**
     * Operation generateAffluenceQuotidienne
     */
    public float generateAffluenceQuotidienne();

    /**
     * Operation generateDureeMoyenneVisite
     */
    public String generateDureeMoyenneVisite();

    /**
     * Operation generateDureeMinimaleVisite
     */
    public String generateDureeMinimaleVisite();

    /**
     * Operation generateDureeMaximaleVisite
     */
    public String generateDureeMaximaleVisite();

    /**
     * Operation generateTauxSatisfaction
     */
    public float generateTauxSatisfaction();

    /**
     * Operation generateEstFavoris
     */
    public boolean generateEstFavoris();

}
