package AssistanceTouristique;

/**
 * Holder class for : ServiceESSite
 * 
 * @author OpenORB Compiler
 */
final public class ServiceESSiteHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal ServiceESSite value
     */
    public AssistanceTouristique.ServiceESSite value;

    /**
     * Default constructor
     */
    public ServiceESSiteHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public ServiceESSiteHolder(AssistanceTouristique.ServiceESSite initial)
    {
        value = initial;
    }

    /**
     * Read ServiceESSite from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = ServiceESSiteHelper.read(istream);
    }

    /**
     * Write ServiceESSite into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        ServiceESSiteHelper.write(ostream,value);
    }

    /**
     * Return the ServiceESSite TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return ServiceESSiteHelper.type();
    }

}
