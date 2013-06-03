package AssistanceTouristique;

/**
 * Interface definition : ServiceStatSite
 * 
 * @author OpenORB Compiler
 */
public class _ServiceStatSiteStub extends org.omg.CORBA.portable.ObjectImpl
        implements ServiceStatSite
{
    static final String[] _ids_list =
    {
        "IDL:AssistanceTouristique/ServiceStatSite:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = AssistanceTouristique.ServiceStatSiteOperations.class;

    /**
     * Operation getStatsSite
     */
    public AssistanceTouristique.Statistique[] getStatsSite()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getStatsSite",true);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getStatsSite",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceStatSiteOperations _self = (AssistanceTouristique.ServiceStatSiteOperations) _so.servant;
                try
                {
                    return _self.getStatsSite();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation afficherInfosES
     */
    public void afficherInfosES(AssistanceTouristique.Visite[] listeVisites)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("afficherInfosES",true);
                    AssistanceTouristique.t_listeVisitesHelper.write(_output,listeVisites);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("afficherInfosES",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceStatSiteOperations _self = (AssistanceTouristique.ServiceStatSiteOperations) _so.servant;
                try
                {
                    _self.afficherInfosES( listeVisites);
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
