package AssistanceTouristique;

/**
 * Holder class for : Office
 * 
 * @author OpenORB Compiler
 */
final public class OfficeHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal Office value
     */
    public AssistanceTouristique.Office value;

    /**
     * Default constructor
     */
    public OfficeHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public OfficeHolder(AssistanceTouristique.Office initial)
    {
        value = initial;
    }

    /**
     * Read Office from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = OfficeHelper.read(istream);
    }

    /**
     * Write Office into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        OfficeHelper.write(ostream,value);
    }

    /**
     * Return the Office TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return OfficeHelper.type();
    }

}
