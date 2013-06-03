package AssistanceTouristique;

/**
 * Interface definition : Office
 * 
 * @author OpenORB Compiler
 */
public class OfficePOATie extends OfficePOA
{

    //
    // Private reference to implementation object
    //
    private OfficeOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public OfficePOATie(OfficeOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public OfficePOATie(OfficeOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public OfficeOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(OfficeOperations delegate_)
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
     * Operation getListeSitesAVisiter
     */
    public AssistanceTouristique.Site[] getListeSitesAVisiter(short idCarte, AssistanceTouristique.Coordonnees coordGPS, AssistanceTouristique.Site[] listeSitesVisites)
    {
        return _tie.getListeSitesAVisiter( idCarte,  coordGPS,  listeSitesVisites);
    }

}
