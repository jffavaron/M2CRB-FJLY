package AssistanceTouristique.ServiceAchatOfficePackage;

/**
 * Holder class for : achatImpossibleException
 * 
 * @author OpenORB Compiler
 */
final public class achatImpossibleExceptionHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal achatImpossibleException value
     */
    public AssistanceTouristique.ServiceAchatOfficePackage.achatImpossibleException value;

    /**
     * Default constructor
     */
    public achatImpossibleExceptionHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public achatImpossibleExceptionHolder(AssistanceTouristique.ServiceAchatOfficePackage.achatImpossibleException initial)
    {
        value = initial;
    }

    /**
     * Read achatImpossibleException from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = achatImpossibleExceptionHelper.read(istream);
    }

    /**
     * Write achatImpossibleException into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        achatImpossibleExceptionHelper.write(ostream,value);
    }

    /**
     * Return the achatImpossibleException TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return achatImpossibleExceptionHelper.type();
    }

}
