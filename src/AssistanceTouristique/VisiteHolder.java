package AssistanceTouristique;

/**
 * Holder class for : Visite
 * 
 * @author OpenORB Compiler
 */
final public class VisiteHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal Visite value
     */
    public AssistanceTouristique.Visite value;

    /**
     * Default constructor
     */
    public VisiteHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public VisiteHolder(AssistanceTouristique.Visite initial)
    {
        value = initial;
    }

    /**
     * Read Visite from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = VisiteHelper.read(istream);
    }

    /**
     * Write Visite into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        VisiteHelper.write(ostream,value);
    }

    /**
     * Return the Visite TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return VisiteHelper.type();
    }

}
