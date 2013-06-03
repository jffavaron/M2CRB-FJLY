package AssistanceTouristique;

/**
 * Holder class for : SiteTouristique
 * 
 * @author OpenORB Compiler
 */
final public class SiteTouristiqueHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal SiteTouristique value
     */
    public AssistanceTouristique.SiteTouristique value;

    /**
     * Default constructor
     */
    public SiteTouristiqueHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public SiteTouristiqueHolder(AssistanceTouristique.SiteTouristique initial)
    {
        value = initial;
    }

    /**
     * Read SiteTouristique from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = SiteTouristiqueHelper.read(istream);
    }

    /**
     * Write SiteTouristique into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        SiteTouristiqueHelper.write(ostream,value);
    }

    /**
     * Return the SiteTouristique TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return SiteTouristiqueHelper.type();
    }

}
