package AssistanceTouristique;

/**
 * Holder class for : ServiceStatOffice
 * 
 * @author OpenORB Compiler
 */
final public class ServiceStatOfficeHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal ServiceStatOffice value
     */
    public AssistanceTouristique.ServiceStatOffice value;

    /**
     * Default constructor
     */
    public ServiceStatOfficeHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public ServiceStatOfficeHolder(AssistanceTouristique.ServiceStatOffice initial)
    {
        value = initial;
    }

    /**
     * Read ServiceStatOffice from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = ServiceStatOfficeHelper.read(istream);
    }

    /**
     * Write ServiceStatOffice into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        ServiceStatOfficeHelper.write(ostream,value);
    }

    /**
     * Return the ServiceStatOffice TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return ServiceStatOfficeHelper.type();
    }

}
