package AssistanceTouristique;

/**
 * Holder class for : ServiceAchatOffice
 * 
 * @author OpenORB Compiler
 */
final public class ServiceAchatOfficeHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal ServiceAchatOffice value
     */
    public AssistanceTouristique.ServiceAchatOffice value;

    /**
     * Default constructor
     */
    public ServiceAchatOfficeHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public ServiceAchatOfficeHolder(AssistanceTouristique.ServiceAchatOffice initial)
    {
        value = initial;
    }

    /**
     * Read ServiceAchatOffice from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = ServiceAchatOfficeHelper.read(istream);
    }

    /**
     * Write ServiceAchatOffice into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        ServiceAchatOfficeHelper.write(ostream,value);
    }

    /**
     * Return the ServiceAchatOffice TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return ServiceAchatOfficeHelper.type();
    }

}
