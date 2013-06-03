package AssistanceTouristique;

/**
 * Holder class for : Site
 * 
 * @author OpenORB Compiler
 */
final public class SiteHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal Site value
     */
    public AssistanceTouristique.Site value;

    /**
     * Default constructor
     */
    public SiteHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public SiteHolder(AssistanceTouristique.Site initial)
    {
        value = initial;
    }

    /**
     * Read Site from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = SiteHelper.read(istream);
    }

    /**
     * Write Site into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        SiteHelper.write(ostream,value);
    }

    /**
     * Return the Site TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return SiteHelper.type();
    }

}
