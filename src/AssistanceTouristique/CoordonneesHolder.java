package AssistanceTouristique;

/**
 * Holder class for : Coordonnees
 * 
 * @author OpenORB Compiler
 */
final public class CoordonneesHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal Coordonnees value
     */
    public AssistanceTouristique.Coordonnees value;

    /**
     * Default constructor
     */
    public CoordonneesHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public CoordonneesHolder(AssistanceTouristique.Coordonnees initial)
    {
        value = initial;
    }

    /**
     * Read Coordonnees from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = CoordonneesHelper.read(istream);
    }

    /**
     * Write Coordonnees into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        CoordonneesHelper.write(ostream,value);
    }

    /**
     * Return the Coordonnees TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return CoordonneesHelper.type();
    }

}
