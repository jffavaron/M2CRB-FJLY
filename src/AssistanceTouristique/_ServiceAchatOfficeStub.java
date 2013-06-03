package AssistanceTouristique;

/**
 * Interface definition : ServiceAchatOffice
 * 
 * @author OpenORB Compiler
 */
public class _ServiceAchatOfficeStub extends org.omg.CORBA.portable.ObjectImpl
        implements ServiceAchatOffice
{
    static final String[] _ids_list =
    {
        "IDL:AssistanceTouristique/ServiceAchatOffice:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = AssistanceTouristique.ServiceAchatOfficeOperations.class;

    /**
     * Operation acheterPrestation
     */
    public AssistanceTouristique.Carte acheterPrestation(String dateD, String dateF, float montant)
        throws AssistanceTouristique.ServiceAchatOfficePackage.achatImpossibleException
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("acheterPrestation",true);
                    _output.write_string(dateD);
                    _output.write_string(dateF);
                    _output.write_float(montant);
                    _input = this._invoke(_output);
                    AssistanceTouristique.Carte _arg_ret = AssistanceTouristique.CarteHelper.read(_input);
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(AssistanceTouristique.ServiceAchatOfficePackage.achatImpossibleExceptionHelper.id()))
                    {
                        throw AssistanceTouristique.ServiceAchatOfficePackage.achatImpossibleExceptionHelper.read(_exception.getInputStream());
                    }

                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("acheterPrestation",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceAchatOfficeOperations _self = (AssistanceTouristique.ServiceAchatOfficeOperations) _so.servant;
                try
                {
                    return _self.acheterPrestation( dateD,  dateF,  montant);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
