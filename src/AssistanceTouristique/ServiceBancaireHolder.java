package AssistanceTouristique;

/**
 * Holder class for : ServiceBancaire
 * 
 * @author OpenORB Compiler
 */
final public class ServiceBancaireHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal ServiceBancaire value
     */
    public AssistanceTouristique.ServiceBancaire value;

    /**
     * Default constructor
     */
    public ServiceBancaireHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public ServiceBancaireHolder(AssistanceTouristique.ServiceBancaire initial)
    {
        value = initial;
    }

    /**
     * Read ServiceBancaire from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = ServiceBancaireHelper.read(istream);
    }

    /**
     * Write ServiceBancaire into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        ServiceBancaireHelper.write(ostream,value);
    }

    /**
     * Return the ServiceBancaire TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return ServiceBancaireHelper.type();
    }

}
