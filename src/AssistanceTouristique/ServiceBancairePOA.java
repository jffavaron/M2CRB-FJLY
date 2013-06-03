package AssistanceTouristique;

/**
 * Interface definition : ServiceBancaire
 * 
 * @author OpenORB Compiler
 */
public abstract class ServiceBancairePOA extends org.omg.PortableServer.Servant
        implements ServiceBancaireOperations, org.omg.CORBA.portable.InvokeHandler
{
    public ServiceBancaire _this()
    {
        return ServiceBancaireHelper.narrow(_this_object());
    }

    public ServiceBancaire _this(org.omg.CORBA.ORB orb)
    {
        return ServiceBancaireHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:AssistanceTouristique/ServiceBancaire:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("verifierPaiement")) {
                return _invoke_verifierPaiement(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_verifierPaiement(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        float arg0_in = _is.read_float();

        try
        {
            boolean _arg_result = verifierPaiement(arg0_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (AssistanceTouristique.ServiceBancairePackage.operationImpossibleException _exception)
        {
            _output = handler.createExceptionReply();
            AssistanceTouristique.ServiceBancairePackage.operationImpossibleExceptionHelper.write(_output,_exception);
        }
        return _output;
    }

}
