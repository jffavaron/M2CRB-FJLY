package AssistanceTouristique;

/**
 * Interface definition : ServiceBancaire
 * 
 * @author OpenORB Compiler
 */
public class ServiceBancairePOATie extends ServiceBancairePOA
{

    //
    // Private reference to implementation object
    //
    private ServiceBancaireOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public ServiceBancairePOATie(ServiceBancaireOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public ServiceBancairePOATie(ServiceBancaireOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public ServiceBancaireOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(ServiceBancaireOperations delegate_)
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
     * Operation verifierPaiement
     */
    public boolean verifierPaiement(float montant)
        throws AssistanceTouristique.ServiceBancairePackage.operationImpossibleException
    {
        return _tie.verifierPaiement( montant);
    }

}
