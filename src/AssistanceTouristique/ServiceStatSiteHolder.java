package AssistanceTouristique;

/**
 * Holder class for : ServiceStatSite
 * 
 * @author OpenORB Compiler
 */
final public class ServiceStatSiteHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal ServiceStatSite value
     */
    public AssistanceTouristique.ServiceStatSite value;

    /**
     * Default constructor
     */
    public ServiceStatSiteHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public ServiceStatSiteHolder(AssistanceTouristique.ServiceStatSite initial)
    {
        value = initial;
    }

    /**
     * Read ServiceStatSite from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = ServiceStatSiteHelper.read(istream);
    }

    /**
     * Write ServiceStatSite into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        ServiceStatSiteHelper.write(ostream,value);
    }

    /**
     * Return the ServiceStatSite TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return ServiceStatSiteHelper.type();
    }

}
