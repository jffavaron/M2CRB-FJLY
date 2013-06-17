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
     * Operation notifierAvisVisite
     */
    public void notifierAvisVisite(int visite, String codeSite)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("notifierAvisVisite",true);
                    _output.write_long(visite);
                    _output.write_string(codeSite);
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
                    _self.notifierAvisVisite( visite,  codeSite);
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
