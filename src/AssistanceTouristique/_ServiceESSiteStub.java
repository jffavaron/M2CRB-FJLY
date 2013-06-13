package AssistanceTouristique;

/**
 * Interface definition : ServiceESSite
 * 
 * @author OpenORB Compiler
 */
public class _ServiceESSiteStub extends org.omg.CORBA.portable.ObjectImpl
        implements ServiceESSite
{
    static final String[] _ids_list =
    {
        "IDL:AssistanceTouristique/ServiceESSite:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = AssistanceTouristique.ServiceESSiteOperations.class;

    /**
     * Operation autoriserEntree
     */
    public void autoriserEntree(AssistanceTouristique.Carte carte)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("autoriserEntree",false);
                    AssistanceTouristique.CarteHelper.write(_output,carte);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("autoriserEntree",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    _self.autoriserEntree( carte);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation entrer
     */
    public boolean entrer(short idCarte)
        throws AssistanceTouristique.ServiceESSitePackage.carteNonValideException, AssistanceTouristique.ServiceESSitePackage.siteDejaVisiteException, AssistanceTouristique.ServiceESSitePackage.siteSatureException, AssistanceTouristique.ServiceESSitePackage.siteFermeException
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("entrer",true);
                    _output.write_short(idCarte);
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
                    if (_exception_id.equals(AssistanceTouristique.ServiceESSitePackage.carteNonValideExceptionHelper.id()))
                    {
                        throw AssistanceTouristique.ServiceESSitePackage.carteNonValideExceptionHelper.read(_exception.getInputStream());
                    }

                    if (_exception_id.equals(AssistanceTouristique.ServiceESSitePackage.siteDejaVisiteExceptionHelper.id()))
                    {
                        throw AssistanceTouristique.ServiceESSitePackage.siteDejaVisiteExceptionHelper.read(_exception.getInputStream());
                    }

                    if (_exception_id.equals(AssistanceTouristique.ServiceESSitePackage.siteSatureExceptionHelper.id()))
                    {
                        throw AssistanceTouristique.ServiceESSitePackage.siteSatureExceptionHelper.read(_exception.getInputStream());
                    }

                    if (_exception_id.equals(AssistanceTouristique.ServiceESSitePackage.siteFermeExceptionHelper.id()))
                    {
                        throw AssistanceTouristique.ServiceESSitePackage.siteFermeExceptionHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("entrer",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.entrer( idCarte);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation sortir
     */
    public void sortir(short idCarte)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("sortir",false);
                    _output.write_short(idCarte);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("sortir",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    _self.sortir( idCarte);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation donnerAvisVisite
     */
    public void donnerAvisVisite(float satisfaction)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("donnerAvisVisite",false);
                    _output.write_float(satisfaction);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("donnerAvisVisite",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    _self.donnerAvisVisite( satisfaction);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation getInfosES
     */
    public AssistanceTouristique.Visite[] getInfosES(short idSite)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getInfosES",true);
                    _output.write_short(idSite);
                    _input = this._invoke(_output);
                    AssistanceTouristique.Visite[] _arg_ret = AssistanceTouristique.t_listeVisitesHelper.read(_input);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getInfosES",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.getInfosES( idSite);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation getAffluenceCourante
     */
    public float getAffluenceCourante(short idSite)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getAffluenceCourante",true);
                    _output.write_short(idSite);
                    _input = this._invoke(_output);
                    float _arg_ret = _input.read_float();
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getAffluenceCourante",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.getAffluenceCourante( idSite);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation getTauxSatisfaction
     */
    public float getTauxSatisfaction(short idSite)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getTauxSatisfaction",true);
                    _output.write_short(idSite);
                    _input = this._invoke(_output);
                    float _arg_ret = _input.read_float();
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getTauxSatisfaction",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.getTauxSatisfaction( idSite);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation getEstFavoris
     */
    public boolean getEstFavoris(short idSite)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getEstFavoris",true);
                    _output.write_short(idSite);
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
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getEstFavoris",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.getEstFavoris( idSite);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
