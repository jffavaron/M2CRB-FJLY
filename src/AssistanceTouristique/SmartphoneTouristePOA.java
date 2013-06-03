package AssistanceTouristique;

/**
 * Interface definition : SmartphoneTouriste
 * 
 * @author OpenORB Compiler
 */
public abstract class SmartphoneTouristePOA extends org.omg.PortableServer.Servant
        implements SmartphoneTouristeOperations, org.omg.CORBA.portable.InvokeHandler
{
    public SmartphoneTouriste _this()
    {
        return SmartphoneTouristeHelper.narrow(_this_object());
    }

    public SmartphoneTouriste _this(org.omg.CORBA.ORB orb)
    {
        return SmartphoneTouristeHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:AssistanceTouristique/SmartphoneTouriste:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("_get_idCarteAchetee")) {
                return _invoke__get_idCarteAchetee(_is, handler);
        } else if (opName.equals("notifierAvisVisite")) {
                return _invoke_notifierAvisVisite(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke__get_idCarteAchetee(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        short arg = idCarteAchetee();
        _output = handler.createReply();
        _output.write_short(arg);
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_notifierAvisVisite(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        AssistanceTouristique.Visite arg0_in = AssistanceTouristique.VisiteHelper.read(_is);
        AssistanceTouristique.Site arg1_in = AssistanceTouristique.SiteHelper.read(_is);

        notifierAvisVisite(arg0_in, arg1_in);

        _output = handler.createReply();

        return _output;
    }

}
