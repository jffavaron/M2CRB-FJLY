package AssistanceTouristique.ServiceBancairePackage;

/**
 * Holder class for : operationImpossibleException
 * 
 * @author OpenORB Compiler
 */
final public class operationImpossibleExceptionHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal operationImpossibleException value
     */
    public AssistanceTouristique.ServiceBancairePackage.operationImpossibleException value;

    /**
     * Default constructor
     */
    public operationImpossibleExceptionHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public operationImpossibleExceptionHolder(AssistanceTouristique.ServiceBancairePackage.operationImpossibleException initial)
    {
        value = initial;
    }

    /**
     * Read operationImpossibleException from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = operationImpossibleExceptionHelper.read(istream);
    }

    /**
     * Write operationImpossibleException into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        operationImpossibleExceptionHelper.write(ostream,value);
    }

    /**
     * Return the operationImpossibleException TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return operationImpossibleExceptionHelper.type();
    }

}
