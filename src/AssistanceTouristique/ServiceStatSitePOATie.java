package AssistanceTouristique;

/**
 * Interface definition : ServiceStatSite
 * 
 * @author OpenORB Compiler
 */
public class ServiceStatSitePOATie extends ServiceStatSitePOA
{

    //
    // Private reference to implementation object
    //
    private ServiceStatSiteOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public ServiceStatSitePOATie(ServiceStatSiteOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public ServiceStatSitePOATie(ServiceStatSiteOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public ServiceStatSiteOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(ServiceStatSiteOperations delegate_)
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
     * Operation getStatsSite
     */
    public AssistanceTouristique.Statistique[] getStatsSite()
    {
        return _tie.getStatsSite();
    }

    /**
     * Operation afficherInfosES
     */
    public void afficherInfosES(AssistanceTouristique.Visite[] listeVisites)
    {
        _tie.afficherInfosES( listeVisites);
    }

}
