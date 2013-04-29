package GestionAssitanceTouristique;

/**
 * Interface definition : Office
 * 
 * @author OpenORB Compiler
 */
public abstract class OfficePOA extends org.omg.PortableServer.Servant
        implements OfficeOperations, org.omg.CORBA.portable.InvokeHandler
{
    public Office _this()
    {
        return OfficeHelper.narrow(_this_object());
    }

    public Office _this(org.omg.CORBA.ORB orb)
    {
        return OfficeHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:GestionAssitanceTouristique/Office:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("getListeSitesAVisiter")) {
                return _invoke_getListeSitesAVisiter(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_getListeSitesAVisiter(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        short arg0_in = _is.read_short();
        GestionAssitanceTouristique.Coordonnees arg1_in = GestionAssitanceTouristique.CoordonneesHelper.read(_is);
        GestionAssitanceTouristique.Site[] arg2_in = GestionAssitanceTouristique.t_listeSitesHelper.read(_is);

        GestionAssitanceTouristique.Site[] _arg_result = getListeSitesAVisiter(arg0_in, arg1_in, arg2_in);

        _output = handler.createReply();
        GestionAssitanceTouristique.t_listeSitesHelper.write(_output,_arg_result);

        return _output;
    }

}
