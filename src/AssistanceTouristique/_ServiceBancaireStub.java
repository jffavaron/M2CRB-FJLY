package AssistanceTouristique;

/**
 * Interface definition : ServiceBancaire
 * 
 * @author OpenORB Compiler
 */
public class _ServiceBancaireStub extends org.omg.CORBA.portable.ObjectImpl
        implements ServiceBancaire
{
    static final String[] _ids_list =
    {
        "IDL:AssistanceTouristique/ServiceBancaire:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = AssistanceTouristique.ServiceBancaireOperations.class;

    /**
     * Operation verifierPaiement
     */
    public boolean verifierPaiement(float montant)
        throws AssistanceTouristique.ServiceBancairePackage.operationImpossibleException
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("verifierPaiement",true);
                    _output.write_float(montant);
                    _input = this._invoke(_output);
                    boolean _arg_ret = _input.read_boolean();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(AssistanceTouristique.ServiceBancairePackage.operationImpossibleExceptionHelper.id()))
                    {
                        throw AssistanceTouristique.ServiceBancairePackage.operationImpossibleExceptionHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("verifierPaiement",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceBancaireOperations _self = (AssistanceTouristique.ServiceBancaireOperations) _so.servant;
                try
                {
                    return _self.verifierPaiement( montant);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
