package AssistanceTouristique;

/**
 * Holder class for : t_listeId
 * 
 * @author OpenORB Compiler
 */
final public class t_listeIdHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal t_listeId value
     */
    public short[] value;

    /**
     * Default constructor
     */
    public t_listeIdHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public t_listeIdHolder(short[] initial)
    {
        value = initial;
    }

    /**
     * Read t_listeId from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = t_listeIdHelper.read(istream);
    }

    /**
     * Write t_listeId into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        t_listeIdHelper.write(ostream,value);
    }

    /**
     * Return the t_listeId TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return t_listeIdHelper.type();
    }

}
