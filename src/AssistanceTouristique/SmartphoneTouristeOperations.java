package AssistanceTouristique;

/**
 * Interface definition : SmartphoneTouriste
 * 
 * @author OpenORB Compiler
 */
public interface SmartphoneTouristeOperations
{
    /**
     * Read accessor for idCarteAchetee attribute
     * @return the attribute value
     */
    public short idCarteAchetee();

    /**
     * Operation notifierAvisVisite
     */
    public void notifierAvisVisite(AssistanceTouristique.Visite visite, AssistanceTouristique.Site site);

}
