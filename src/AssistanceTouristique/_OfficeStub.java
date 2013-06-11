package AssistanceTouristique;

/**
 * Interface definition : Office
 * 
 * @author OpenORB Compiler
 */
public class _OfficeStub extends org.omg.CORBA.portable.ObjectImpl
        implements Office
{
    static final String[] _ids_list =
    {
        "IDL:AssistanceTouristique/Office:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = AssistanceTouristique.OfficeOperations.class;

    /**
     * Operation getListeSitesAVisiter
     */
    public AssistanceTouristique.Site[] getListeSitesAVisiter(short idCarte, AssistanceTouristique.Coordonnees coordGPS, short[] listeIdSitesVisites)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getListeSitesAVisiter",true);
                    _output.write_short(idCarte);
                    AssistanceTouristique.CoordonneesHelper.write(_output,coordGPS);
                    AssistanceTouristique.t_listeIdHelper.write(_output,listeIdSitesVisites);
                    _input = this._invoke(_output);
                    AssistanceTouristique.Site[] _arg_ret = AssistanceTouristique.t_listeSitesHelper.read(_input);
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getListeSitesAVisiter",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.OfficeOperations _self = (AssistanceTouristique.OfficeOperations) _so.servant;
                try
                {
                    return _self.getListeSitesAVisiter( idCarte,  coordGPS,  listeIdSitesVisites);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
