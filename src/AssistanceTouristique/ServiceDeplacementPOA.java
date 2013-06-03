package AssistanceTouristique;

/**
 * Interface definition : ServiceDeplacement
 * 
 * @author OpenORB Compiler
 */
public abstract class ServiceDeplacementPOA extends org.omg.PortableServer.Servant
        implements ServiceDeplacementOperations, org.omg.CORBA.portable.InvokeHandler
{
    public ServiceDeplacement _this()
    {
        return ServiceDeplacementHelper.narrow(_this_object());
    }

    public ServiceDeplacement _this(org.omg.CORBA.ORB orb)
    {
        return ServiceDeplacementHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:AssistanceTouristique/ServiceDeplacement:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("calculerDureeTrajet")) {
                return _invoke_calculerDureeTrajet(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_calculerDureeTrajet(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        AssistanceTouristique.Coordonnees arg0_in = AssistanceTouristique.CoordonneesHelper.read(_is);
        AssistanceTouristique.Coordonnees arg1_in = AssistanceTouristique.CoordonneesHelper.read(_is);
        String arg2_in = _is.read_string();

        try
        {
            int _arg_result = calculerDureeTrajet(arg0_in, arg1_in, arg2_in);

            _output = handler.createReply();
            _output.write_long(_arg_result);

        }
        catch (AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesException _exception)
        {
            _output = handler.createExceptionReply();
            AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesExceptionHelper.write(_output,_exception);
        }
        return _output;
    }

}
