package AssistanceTouristique;

/**
 * Holder class for : SmartphoneTouriste
 * 
 * @author OpenORB Compiler
 */
final public class SmartphoneTouristeHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal SmartphoneTouriste value
     */
    public AssistanceTouristique.SmartphoneTouriste value;

    /**
     * Default constructor
     */
    public SmartphoneTouristeHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public SmartphoneTouristeHolder(AssistanceTouristique.SmartphoneTouriste initial)
    {
        value = initial;
    }

    /**
     * Read SmartphoneTouriste from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = SmartphoneTouristeHelper.read(istream);
    }

    /**
     * Write SmartphoneTouriste into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        SmartphoneTouristeHelper.write(ostream,value);
    }

    /**
     * Return the SmartphoneTouriste TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return SmartphoneTouristeHelper.type();
    }

}
