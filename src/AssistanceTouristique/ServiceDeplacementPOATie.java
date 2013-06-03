package AssistanceTouristique;

/**
 * Interface definition : ServiceDeplacement
 * 
 * @author OpenORB Compiler
 */
public class ServiceDeplacementPOATie extends ServiceDeplacementPOA
{

    //
    // Private reference to implementation object
    //
    private ServiceDeplacementOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public ServiceDeplacementPOATie(ServiceDeplacementOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public ServiceDeplacementPOATie(ServiceDeplacementOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public ServiceDeplacementOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(ServiceDeplacementOperations delegate_)
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
     * Operation calculerDureeTrajet
     */
    public int calculerDureeTrajet(AssistanceTouristique.Coordonnees coordGPS_A, AssistanceTouristique.Coordonnees coordGPS_B, String mode)
        throws AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesException
    {
        return _tie.calculerDureeTrajet( coordGPS_A,  coordGPS_B,  mode);
    }

}
