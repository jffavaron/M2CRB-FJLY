package AssistanceTouristique;

/**
 * Interface definition : ServiceAchatOffice
 * 
 * @author OpenORB Compiler
 */
public abstract class ServiceAchatOfficePOA extends org.omg.PortableServer.Servant
        implements ServiceAchatOfficeOperations, org.omg.CORBA.portable.InvokeHandler
{
    public ServiceAchatOffice _this()
    {
        return ServiceAchatOfficeHelper.narrow(_this_object());
    }

    public ServiceAchatOffice _this(org.omg.CORBA.ORB orb)
    {
        return ServiceAchatOfficeHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:AssistanceTouristique/ServiceAchatOffice:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("acheterPrestation")) {
                return _invoke_acheterPrestation(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_acheterPrestation(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();
        String arg1_in = _is.read_string();
        float arg2_in = _is.read_float();

        try
        {
            AssistanceTouristique.Carte _arg_result = acheterPrestation(arg0_in, arg1_in, arg2_in);

            _output = handler.createReply();
            AssistanceTouristique.CarteHelper.write(_output,_arg_result);

        }
        catch (AssistanceTouristique.ServiceAchatOfficePackage.achatImpossibleException _exception)
        {
            _output = handler.createExceptionReply();
            AssistanceTouristique.ServiceAchatOfficePackage.achatImpossibleExceptionHelper.write(_output,_exception);
        }
        return _output;
    }

}
