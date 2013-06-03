package AssistanceTouristique;

/**
 * Interface definition : SmartphoneTouriste
 * 
 * @author OpenORB Compiler
 */
public class SmartphoneTouristePOATie extends SmartphoneTouristePOA
{

    //
    // Private reference to implementation object
    //
    private SmartphoneTouristeOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public SmartphoneTouristePOATie(SmartphoneTouristeOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public SmartphoneTouristePOATie(SmartphoneTouristeOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public SmartphoneTouristeOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(SmartphoneTouristeOperations delegate_)
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
     * Read accessor for idCarteAchetee attribute
     */
    public short idCarteAchetee()
    {
        return _tie.idCarteAchetee();
    }

    /**
     * Operation notifierAvisVisite
     */
    public void notifierAvisVisite(AssistanceTouristique.Visite visite, AssistanceTouristique.Site site)
    {
        _tie.notifierAvisVisite( visite,  site);
    }

}
