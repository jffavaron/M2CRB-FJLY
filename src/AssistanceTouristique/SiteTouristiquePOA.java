package AssistanceTouristique;

/**
 * Interface definition : SiteTouristique
 * 
 * @author OpenORB Compiler
 */
public abstract class SiteTouristiquePOA extends org.omg.PortableServer.Servant
        implements SiteTouristiqueOperations, org.omg.CORBA.portable.InvokeHandler
{
    public SiteTouristique _this()
    {
        return SiteTouristiqueHelper.narrow(_this_object());
    }

    public SiteTouristique _this(org.omg.CORBA.ORB orb)
    {
        return SiteTouristiqueHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:AssistanceTouristique/SiteTouristique:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("getInfoSite")) {
                return _invoke_getInfoSite(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_getInfoSite(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        short arg0_in = _is.read_short();

        AssistanceTouristique.Site _arg_result = getInfoSite(arg0_in);

        _output = handler.createReply();
        AssistanceTouristique.SiteHelper.write(_output,_arg_result);

        return _output;
    }

}
