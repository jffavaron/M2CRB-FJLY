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
        throws AssistanceTouristique.ServiceESSitePackage.carteNonValideException
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
    public void sortir(short idVisite)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("sortir",false);
                    _output.write_short(idVisite);
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
                    _self.sortir( idVisite);
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
    public void donnerAvisVisite(AssistanceTouristique.Visite visite, float satisfaction)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("donnerAvisVisite",false);
                    AssistanceTouristique.VisiteHelper.write(_output,visite);
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
                    _self.donnerAvisVisite( visite,  satisfaction);
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
     * Operation getAffluenceCourante
     */
    public float getAffluenceCourante()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getAffluenceCourante",true);
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
                    return _self.getAffluenceCourante();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation generateAffluenceQuotidienne
     */
    public float generateAffluenceQuotidienne()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("generateAffluenceQuotidienne",true);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("generateAffluenceQuotidienne",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.generateAffluenceQuotidienne();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation generateDureeMoyenneVisite
     */
    public String generateDureeMoyenneVisite()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("generateDureeMoyenneVisite",true);
                    _input = this._invoke(_output);
                    String _arg_ret = _input.read_string();
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("generateDureeMoyenneVisite",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.generateDureeMoyenneVisite();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation generateDureeMinimaleVisite
     */
    public String generateDureeMinimaleVisite()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("generateDureeMinimaleVisite",true);
                    _input = this._invoke(_output);
                    String _arg_ret = _input.read_string();
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("generateDureeMinimaleVisite",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.generateDureeMinimaleVisite();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation generateDureeMaximaleVisite
     */
    public String generateDureeMaximaleVisite()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("generateDureeMaximaleVisite",true);
                    _input = this._invoke(_output);
                    String _arg_ret = _input.read_string();
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("generateDureeMaximaleVisite",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.generateDureeMaximaleVisite();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation generateTauxSatisfaction
     */
    public float generateTauxSatisfaction()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("generateTauxSatisfaction",true);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("generateTauxSatisfaction",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.generateTauxSatisfaction();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation generateEstFavoris
     */
    public boolean generateEstFavoris()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("generateEstFavoris",true);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("generateEstFavoris",_opsClass);
                if (_so == null)
                   continue;
                AssistanceTouristique.ServiceESSiteOperations _self = (AssistanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.generateEstFavoris();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
