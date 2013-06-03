package AssistanceTouristique;

/**
 * Interface definition : ServiceStatOffice
 * 
 * @author OpenORB Compiler
 */
public class _ServiceStatOfficeStub extends org.omg.CORBA.portable.ObjectImpl
        implements ServiceStatOffice
{
    static final String[] _ids_list =
    {
        "IDL:AssistanceTouristique/ServiceStatOffice:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = AssistanceTouristique.ServiceStatOfficeOperations.class;

    /**
     * Operation getStatsGlobales
     */
    public AssistanceTouristique.Statistique[] getStatsGlobales()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getStatsGlobales",true);
                    _input = this._invoke(_output);
                    AssistanceTouristique.Statistique[] _arg_ret = AssistanceTouristique.t_listeStatHelper.read(_input);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getStatsGlobales",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceStatOfficeOperations _self = (AssistanceTouristique.ServiceStatOfficeOperations) _so.servant;
                try
                {
                    return _self.getStatsGlobales();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation afficherStatsSite
     */
    public void afficherStatsSite(AssistanceTouristique.Statistique[] listeStat)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("afficherStatsSite",true);
                    AssistanceTouristique.t_listeStatHelper.write(_output,listeStat);
                    _input = this._invoke(_output);
                    return;
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("afficherStatsSite",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceStatOfficeOperations _self = (AssistanceTouristique.ServiceStatOfficeOperations) _so.servant;
                try
                {
                    _self.afficherStatsSite( listeStat);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
