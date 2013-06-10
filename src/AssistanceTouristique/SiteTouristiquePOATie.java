package AssistanceTouristique;

/**
 * Interface definition : SiteTouristique
 * 
 * @author OpenORB Compiler
 */
public class SiteTouristiquePOATie extends SiteTouristiquePOA
{

    //
    // Private reference to implementation object
    //
    private SiteTouristiqueOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public SiteTouristiquePOATie(SiteTouristiqueOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public SiteTouristiquePOATie(SiteTouristiqueOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public SiteTouristiqueOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(SiteTouristiqueOperations delegate_)
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
     * Operation getHorairesFermeture
     */
    public short getHorairesFermeture(int idSite)
    {
        return _tie.getHorairesFermeture( idSite);
    }

}
