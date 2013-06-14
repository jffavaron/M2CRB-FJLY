package AssistanceTouristique;

/**
 * Interface definition : ServiceESSite
 * 
 * @author OpenORB Compiler
 */
public class ServiceESSitePOATie extends ServiceESSitePOA
{

    //
    // Private reference to implementation object
    //
    private ServiceESSiteOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public ServiceESSitePOATie(ServiceESSiteOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public ServiceESSitePOATie(ServiceESSiteOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public ServiceESSiteOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(ServiceESSiteOperations delegate_)
    {
        _tie = delegate_;
    }

    /**
     * _default_POA method
     */
    public org.omg.PortableServer.POA _default_POA()
    {
        if (_poa != null)
            return _poa;
        else
            return super._default_POA();
    }

    /**
     * Operation autoriserEntree
     */
    public void autoriserEntree(AssistanceTouristique.Carte carte)
    {
        _tie.autoriserEntree( carte);
    }

    /**
     * Operation entrer
     */
    public boolean entrer(short idCarte)
        throws AssistanceTouristique.ServiceESSitePackage.carteNonValideException
    {
        return _tie.entrer( idCarte);
    }

    /**
     * Operation sortir
     */
    public void sortir(short idVisite)
    {
        _tie.sortir( idVisite);
    }

    /**
     * Operation donnerAvisVisite
     */
    public void donnerAvisVisite(AssistanceTouristique.Visite visite, float satisfaction)
    {
        _tie.donnerAvisVisite( visite,  satisfaction);
    }

    /**
     * Operation getAffluenceCourante
     */
    public float getAffluenceCourante()
    {
        return _tie.getAffluenceCourante();
    }

    /**
     * Operation generateAffluenceQuotidienne
     */
    public float generateAffluenceQuotidienne()
    {
        return _tie.generateAffluenceQuotidienne();
    }

    /**
     * Operation generateDureeMoyenneVisite
     */
    public String generateDureeMoyenneVisite()
    {
        return _tie.generateDureeMoyenneVisite();
    }

    /**
     * Operation generateDureeMinimaleVisite
     */
    public String generateDureeMinimaleVisite()
    {
        return _tie.generateDureeMinimaleVisite();
    }

    /**
     * Operation generateDureeMaximaleVisite
     */
    public String generateDureeMaximaleVisite()
    {
        return _tie.generateDureeMaximaleVisite();
    }

    /**
     * Operation generateTauxSatisfaction
     */
    public float generateTauxSatisfaction()
    {
        return _tie.generateTauxSatisfaction();
    }

    /**
     * Operation generateEstFavoris
     */
    public boolean generateEstFavoris()
    {
        return _tie.generateEstFavoris();
    }

}
