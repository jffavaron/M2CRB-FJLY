package AssistanceTouristique.ServiceESSitePackage;

/**
 * Holder class for : carteNonValideException
 * 
 * @author OpenORB Compiler
 */
final public class carteNonValideExceptionHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal carteNonValideException value
     */
    public AssistanceTouristique.ServiceESSitePackage.carteNonValideException value;

    /**
     * Default constructor
     */
    public carteNonValideExceptionHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public carteNonValideExceptionHolder(AssistanceTouristique.ServiceESSitePackage.carteNonValideException initial)
    {
        value = initial;
    }

    /**
     * Read carteNonValideException from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = carteNonValideExceptionHelper.read(istream);
    }

    /**
     * Write carteNonValideException into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        carteNonValideExceptionHelper.write(ostream,value);
    }

    /**
     * Return the carteNonValideException TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return carteNonValideExceptionHelper.type();
    }

}
