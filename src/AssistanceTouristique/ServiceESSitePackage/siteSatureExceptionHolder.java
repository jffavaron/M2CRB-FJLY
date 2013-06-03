package AssistanceTouristique.ServiceESSitePackage;

/**
 * Holder class for : siteSatureException
 * 
 * @author OpenORB Compiler
 */
final public class siteSatureExceptionHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal siteSatureException value
     */
    public AssistanceTouristique.ServiceESSitePackage.siteSatureException value;

    /**
     * Default constructor
     */
    public siteSatureExceptionHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public siteSatureExceptionHolder(AssistanceTouristique.ServiceESSitePackage.siteSatureException initial)
    {
        value = initial;
    }

    /**
     * Read siteSatureException from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = siteSatureExceptionHelper.read(istream);
    }

    /**
     * Write siteSatureException into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        siteSatureExceptionHelper.write(ostream,value);
    }

    /**
     * Return the siteSatureException TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return siteSatureExceptionHelper.type();
    }

}
