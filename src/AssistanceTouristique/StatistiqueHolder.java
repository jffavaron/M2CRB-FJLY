package AssistanceTouristique;

/**
 * Holder class for : Statistique
 * 
 * @author OpenORB Compiler
 */
final public class StatistiqueHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal Statistique value
     */
    public AssistanceTouristique.Statistique value;

    /**
     * Default constructor
     */
    public StatistiqueHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public StatistiqueHolder(AssistanceTouristique.Statistique initial)
    {
        value = initial;
    }

    /**
     * Read Statistique from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = StatistiqueHelper.read(istream);
    }

    /**
     * Write Statistique into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        StatistiqueHelper.write(ostream,value);
    }

    /**
     * Return the Statistique TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return StatistiqueHelper.type();
    }

}
