package AssistanceTouristique;

/**
 * Holder class for : Carte
 * 
 * @author OpenORB Compiler
 */
final public class CarteHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal Carte value
     */
    public AssistanceTouristique.Carte value;

    /**
     * Default constructor
     */
    public CarteHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public CarteHolder(AssistanceTouristique.Carte initial)
    {
        value = initial;
    }

    /**
     * Read Carte from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = CarteHelper.read(istream);
    }

    /**
     * Write Carte into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        CarteHelper.write(ostream,value);
    }

    /**
     * Return the Carte TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return CarteHelper.type();
    }

}
