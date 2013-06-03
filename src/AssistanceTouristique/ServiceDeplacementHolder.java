package AssistanceTouristique;

/**
 * Holder class for : ServiceDeplacement
 * 
 * @author OpenORB Compiler
 */
final public class ServiceDeplacementHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal ServiceDeplacement value
     */
    public AssistanceTouristique.ServiceDeplacement value;

    /**
     * Default constructor
     */
    public ServiceDeplacementHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public ServiceDeplacementHolder(AssistanceTouristique.ServiceDeplacement initial)
    {
        value = initial;
    }

    /**
     * Read ServiceDeplacement from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = ServiceDeplacementHelper.read(istream);
    }

    /**
     * Write ServiceDeplacement into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        ServiceDeplacementHelper.write(ostream,value);
    }

    /**
     * Return the ServiceDeplacement TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return ServiceDeplacementHelper.type();
    }

}
