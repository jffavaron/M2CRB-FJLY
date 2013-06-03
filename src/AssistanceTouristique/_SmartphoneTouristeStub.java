package AssistanceTouristique;

/**
 * Interface definition : SmartphoneTouriste
 * 
 * @author OpenORB Compiler
 */
public class _SmartphoneTouristeStub extends org.omg.CORBA.portable.ObjectImpl
        implements SmartphoneTouriste
{
    static final String[] _ids_list =
    {
        "IDL:AssistanceTouristique/SmartphoneTouriste:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = AssistanceTouristique.SmartphoneTouristeOperations.class;

    /**
     * Read accessor for idCarteAchetee attribute
     * @return the attribute value
     */
    public short idCarteAchetee()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try {
                    org.omg.CORBA.portable.OutputStream _output = this._request("_get_idCarteAchetee",true);
                    _input = this._invoke(_output);
                    return _input.read_short();
                } catch (final org.omg.CORBA.portable.RemarshalException _exception) {
                    continue;
                } catch (final org.omg.CORBA.portable.ApplicationException _exception) {
                    final String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                } finally {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("_get_idCarteAchetee",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.SmartphoneTouristeOperations _self = (AssistanceTouristique.SmartphoneTouristeOperations) _so.servant;
                try
                {
                    return _self.idCarteAchetee();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation notifierAvisVisite
     */
    public void notifierAvisVisite(AssistanceTouristique.Visite visite, AssistanceTouristique.Site site)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("notifierAvisVisite",true);
                    AssistanceTouristique.VisiteHelper.write(_output,visite);
                    AssistanceTouristique.SiteHelper.write(_output,site);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("notifierAvisVisite",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.SmartphoneTouristeOperations _self = (AssistanceTouristique.SmartphoneTouristeOperations) _so.servant;
                try
                {
                    _self.notifierAvisVisite( visite,  site);
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
