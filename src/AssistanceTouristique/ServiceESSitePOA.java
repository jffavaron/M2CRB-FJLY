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

    private static final java.util.Map operationMap = new java.util.HashMap();

    static {
            operationMap.put("autoriserEntree",
                    new Operation_autoriserEntree());
            operationMap.put("donnerAvisVisite",
                    new Operation_donnerAvisVisite());
            operationMap.put("entrer",
                    new Operation_entrer());
            operationMap.put("generateAffluenceQuotidienne",
                    new Operation_generateAffluenceQuotidienne());
            operationMap.put("generateDureeMaximaleVisite",
                    new Operation_generateDureeMaximaleVisite());
            operationMap.put("generateDureeMinimaleVisite",
                    new Operation_generateDureeMinimaleVisite());
            operationMap.put("generateDureeMoyenneVisite",
                    new Operation_generateDureeMoyenneVisite());
            operationMap.put("generateEstFavoris",
                    new Operation_generateEstFavoris());
            operationMap.put("generateTauxSatisfaction",
                    new Operation_generateTauxSatisfaction());
            operationMap.put("getAffluenceCourante",
                    new Operation_getAffluenceCourante());
            operationMap.put("sortir",
                    new Operation_sortir());
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        final AbstractOperation operation = (AbstractOperation)operationMap.get(opName);

        if (null == operation) {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }

        return operation.invoke(this, _is, handler);
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
        AssistanceTouristique.Visite arg0_in = AssistanceTouristique.VisiteHelper.read(_is);
        float arg1_in = _is.read_float();

        donnerAvisVisite(arg0_in, arg1_in);

        _output = handler.createReply();

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_getAffluenceCourante(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        float _arg_result = getAffluenceCourante();

        _output = handler.createReply();
        _output.write_float(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_generateAffluenceQuotidienne(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        float _arg_result = generateAffluenceQuotidienne();

        _output = handler.createReply();
        _output.write_float(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_generateDureeMoyenneVisite(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        String _arg_result = generateDureeMoyenneVisite();

        _output = handler.createReply();
        _output.write_string(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_generateDureeMinimaleVisite(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        String _arg_result = generateDureeMinimaleVisite();

        _output = handler.createReply();
        _output.write_string(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_generateDureeMaximaleVisite(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        String _arg_result = generateDureeMaximaleVisite();

        _output = handler.createReply();
        _output.write_string(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_generateTauxSatisfaction(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        float _arg_result = generateTauxSatisfaction();

        _output = handler.createReply();
        _output.write_float(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_generateEstFavoris(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        boolean _arg_result = generateEstFavoris();

        _output = handler.createReply();
        _output.write_boolean(_arg_result);

        return _output;
    }

    // operation classes
    private abstract static class AbstractOperation {
        protected abstract org.omg.CORBA.portable.OutputStream invoke(
                ServiceESSitePOA target,
                org.omg.CORBA.portable.InputStream _is,
                org.omg.CORBA.portable.ResponseHandler handler);
    }

    private static final class Operation_autoriserEntree extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_autoriserEntree(_is, handler);
        }
    }

    private static final class Operation_entrer extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_entrer(_is, handler);
        }
    }

    private static final class Operation_sortir extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_sortir(_is, handler);
        }
    }

    private static final class Operation_donnerAvisVisite extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_donnerAvisVisite(_is, handler);
        }
    }

    private static final class Operation_getAffluenceCourante extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_getAffluenceCourante(_is, handler);
        }
    }

    private static final class Operation_generateAffluenceQuotidienne extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_generateAffluenceQuotidienne(_is, handler);
        }
    }

    private static final class Operation_generateDureeMoyenneVisite extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_generateDureeMoyenneVisite(_is, handler);
        }
    }

    private static final class Operation_generateDureeMinimaleVisite extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_generateDureeMinimaleVisite(_is, handler);
        }
    }

    private static final class Operation_generateDureeMaximaleVisite extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_generateDureeMaximaleVisite(_is, handler);
        }
    }

    private static final class Operation_generateTauxSatisfaction extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_generateTauxSatisfaction(_is, handler);
        }
    }

    private static final class Operation_generateEstFavoris extends AbstractOperation
    {
        protected org.omg.CORBA.portable.OutputStream invoke(
                final ServiceESSitePOA target,
                final org.omg.CORBA.portable.InputStream _is,
                final org.omg.CORBA.portable.ResponseHandler handler) {
            return target._invoke_generateEstFavoris(_is, handler);
        }
    }

}
