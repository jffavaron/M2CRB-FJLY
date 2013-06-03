package AssistanceTouristique;

/**
 * Holder class for : t_listeVisites
 * 
 * @author OpenORB Compiler
 */
final public class t_listeVisitesHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal t_listeVisites value
     */
    public AssistanceTouristique.Visite[] value;

    /**
     * Default constructor
     */
    public t_listeVisitesHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public t_listeVisitesHolder(AssistanceTouristique.Visite[] initial)
    {
        value = initial;
    }

    /**
     * Read t_listeVisites from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = t_listeVisitesHelper.read(istream);
    }

    /**
     * Write t_listeVisites into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        t_listeVisitesHelper.write(ostream,value);
    }

    /**
     * Return the t_listeVisites TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return t_listeVisitesHelper.type();
    }

}
