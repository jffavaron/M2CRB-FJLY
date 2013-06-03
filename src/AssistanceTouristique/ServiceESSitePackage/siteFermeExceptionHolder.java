package AssistanceTouristique.ServiceESSitePackage;

/**
 * Holder class for : siteFermeException
 * 
 * @author OpenORB Compiler
 */
final public class siteFermeExceptionHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal siteFermeException value
     */
    public AssistanceTouristique.ServiceESSitePackage.siteFermeException value;

    /**
     * Default constructor
     */
    public siteFermeExceptionHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public siteFermeExceptionHolder(AssistanceTouristique.ServiceESSitePackage.siteFermeException initial)
    {
        value = initial;
    }

    /**
     * Read siteFermeException from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = siteFermeExceptionHelper.read(istream);
    }

    /**
     * Write siteFermeException into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        siteFermeExceptionHelper.write(ostream,value);
    }

    /**
     * Return the siteFermeException TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return siteFermeExceptionHelper.type();
    }

}
