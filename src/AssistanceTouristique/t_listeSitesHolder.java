package AssistanceTouristique;

/**
 * Holder class for : t_listeSites
 * 
 * @author OpenORB Compiler
 */
final public class t_listeSitesHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal t_listeSites value
     */
    public AssistanceTouristique.Site[] value;

    /**
     * Default constructor
     */
    public t_listeSitesHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public t_listeSitesHolder(AssistanceTouristique.Site[] initial)
    {
        value = initial;
    }

    /**
     * Read t_listeSites from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = t_listeSitesHelper.read(istream);
    }

    /**
     * Write t_listeSites into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        t_listeSitesHelper.write(ostream,value);
    }

    /**
     * Return the t_listeSites TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return t_listeSitesHelper.type();
    }

}
