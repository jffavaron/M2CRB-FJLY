package AssistanceTouristique.ServiceESSitePackage;

/**
 * Holder class for : siteDejaVisiteException
 * 
 * @author OpenORB Compiler
 */
final public class siteDejaVisiteExceptionHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal siteDejaVisiteException value
     */
    public AssistanceTouristique.ServiceESSitePackage.siteDejaVisiteException value;

    /**
     * Default constructor
     */
    public siteDejaVisiteExceptionHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public siteDejaVisiteExceptionHolder(AssistanceTouristique.ServiceESSitePackage.siteDejaVisiteException initial)
    {
        value = initial;
    }

    /**
     * Read siteDejaVisiteException from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = siteDejaVisiteExceptionHelper.read(istream);
    }

    /**
     * Write siteDejaVisiteException into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        siteDejaVisiteExceptionHelper.write(ostream,value);
    }

    /**
     * Return the siteDejaVisiteException TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return siteDejaVisiteExceptionHelper.type();
    }

}
