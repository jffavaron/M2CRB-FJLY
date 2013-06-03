package AssistanceTouristique;

/**
 * Interface definition : ServiceStatOffice
 * 
 * @author OpenORB Compiler
 */
public class ServiceStatOfficePOATie extends ServiceStatOfficePOA
{

    //
    // Private reference to implementation object
    //
    private ServiceStatOfficeOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public ServiceStatOfficePOATie(ServiceStatOfficeOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public ServiceStatOfficePOATie(ServiceStatOfficeOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public ServiceStatOfficeOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(ServiceStatOfficeOperations delegate_)
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
     * Operation getStatsGlobales
     */
    public AssistanceTouristique.Statistique[] getStatsGlobales()
    {
        return _tie.getStatsGlobales();
    }

    /**
     * Operation afficherStatsSite
     */
    public void afficherStatsSite(AssistanceTouristique.Statistique[] listeStat)
    {
        _tie.afficherStatsSite( listeStat);
    }

}
