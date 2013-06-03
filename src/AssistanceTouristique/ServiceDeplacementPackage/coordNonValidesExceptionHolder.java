package AssistanceTouristique.ServiceDeplacementPackage;

/**
 * Holder class for : coordNonValidesException
 * 
 * @author OpenORB Compiler
 */
final public class coordNonValidesExceptionHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal coordNonValidesException value
     */
    public AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesException value;

    /**
     * Default constructor
     */
    public coordNonValidesExceptionHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public coordNonValidesExceptionHolder(AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesException initial)
    {
        value = initial;
    }

    /**
     * Read coordNonValidesException from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = coordNonValidesExceptionHelper.read(istream);
    }

    /**
     * Write coordNonValidesException into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        coordNonValidesExceptionHelper.write(ostream,value);
    }

    /**
     * Return the coordNonValidesException TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return coordNonValidesExceptionHelper.type();
    }

}
