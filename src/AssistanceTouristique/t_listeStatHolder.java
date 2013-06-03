package AssistanceTouristique;

/**
 * Holder class for : t_listeStat
 * 
 * @author OpenORB Compiler
 */
final public class t_listeStatHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal t_listeStat value
     */
    public AssistanceTouristique.Statistique[] value;

    /**
     * Default constructor
     */
    public t_listeStatHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public t_listeStatHolder(AssistanceTouristique.Statistique[] initial)
    {
        value = initial;
    }

    /**
     * Read t_listeStat from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = t_listeStatHelper.read(istream);
    }

    /**
     * Write t_listeStat into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        t_listeStatHelper.write(ostream,value);
    }

    /**
     * Return the t_listeStat TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return t_listeStatHelper.type();
    }

}
