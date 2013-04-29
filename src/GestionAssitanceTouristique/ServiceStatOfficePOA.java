package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceStatOffice
 * 
 * @author OpenORB Compiler
 */
public abstract class ServiceStatOfficePOA extends org.omg.PortableServer.Servant
        implements ServiceStatOfficeOperations, org.omg.CORBA.portable.InvokeHandler
{
    public ServiceStatOffice _this()
    {
        return ServiceStatOfficeHelper.narrow(_this_object());
    }

    public ServiceStatOffice _this(org.omg.CORBA.ORB orb)
    {
        return ServiceStatOfficeHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:GestionAssitanceTouristique/ServiceStatOffice:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("afficherStatsSite")) {
                return _invoke_afficherStatsSite(_is, handler);
        } else if (opName.equals("getStatsGlobales")) {
                return _invoke_getStatsGlobales(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_getStatsGlobales(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        GestionAssitanceTouristique.Statistique[] _arg_result = getStatsGlobales();

        _output = handler.createReply();
        GestionAssitanceTouristique.t_listeStatHelper.write(_output,_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_afficherStatsSite(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        GestionAssitanceTouristique.Statistique[] arg0_in = GestionAssitanceTouristique.t_listeStatHelper.read(_is);

        afficherStatsSite(arg0_in);

        _output = handler.createReply();

        return _output;
    }

}
