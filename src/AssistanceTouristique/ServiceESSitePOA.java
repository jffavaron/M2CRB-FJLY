package AssistanceTouristique;

/**
 * Interface definition : ServiceESSite
 * 
 * @author OpenORB Compiler
 */
public abstract class ServiceESSitePOA extends org.omg.PortableServer.Servant
        implements ServiceESSiteOperations, org.omg.CORBA.portable.InvokeHandler
{
    public ServiceESSite _this()
    {
        return ServiceESSiteHelper.narrow(_this_object());
    }

    public ServiceESSite _this(org.omg.CORBA.ORB orb)
    {
        return ServiceESSiteHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:AssistanceTouristique/ServiceESSite:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("autoriserEntree")) {
                return _invoke_autoriserEntree(_is, handler);
        } else if (opName.equals("donnerAvisVisite")) {
                return _invoke_donnerAvisVisite(_is, handler);
        } else if (opName.equals("entrer")) {
                return _invoke_entrer(_is, handler);
        } else if (opName.equals("getAffluenceCourante")) {
                return _invoke_getAffluenceCourante(_is, handler);
        } else if (opName.equals("getInfosES")) {
                return _invoke_getInfosES(_is, handler);
        } else if (opName.equals("sortir")) {
                return _invoke_sortir(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_autoriserEntree(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        AssistanceTouristique.Carte arg0_in = AssistanceTouristique.CarteHelper.read(_is);

        autoriserEntree(arg0_in);

        _output = handler.createReply();

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_entrer(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        short arg0_in = _is.read_short();

        try
        {
            boolean _arg_result = entrer(arg0_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (AssistanceTouristique.ServiceESSitePackage.carteNonValideException _exception)
        {
            _output = handler.createExceptionReply();
            AssistanceTouristique.ServiceESSitePackage.carteNonValideExceptionHelper.write(_output,_exception);
        }
        catch (AssistanceTouristique.ServiceESSitePackage.siteDejaVisiteException _exception)
        {
            _output = handler.createExceptionReply();
            AssistanceTouristique.ServiceESSitePackage.siteDejaVisiteExceptionHelper.write(_output,_exception);
        }
        catch (AssistanceTouristique.ServiceESSitePackage.siteSatureException _exception)
        {
            _output = handler.createExceptionReply();
            AssistanceTouristique.ServiceESSitePackage.siteSatureExceptionHelper.write(_output,_exception);
        }
        catch (AssistanceTouristique.ServiceESSitePackage.siteFermeException _exception)
        {
            _output = handler.createExceptionReply();
            AssistanceTouristique.ServiceESSitePackage.siteFermeExceptionHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_sortir(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        short arg0_in = _is.read_short();

        sortir(arg0_in);

        _output = handler.createReply();

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_donnerAvisVisite(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();

        donnerAvisVisite(arg0_in);

        _output = handler.createReply();

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_getInfosES(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        short arg0_in = _is.read_short();

        AssistanceTouristique.Visite[] _arg_result = getInfosES(arg0_in);

        _output = handler.createReply();
        AssistanceTouristique.t_listeVisitesHelper.write(_output,_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_getAffluenceCourante(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        short arg0_in = _is.read_short();

        short _arg_result = getAffluenceCourante(arg0_in);

        _output = handler.createReply();
        _output.write_short(_arg_result);

        return _output;
    }

}
