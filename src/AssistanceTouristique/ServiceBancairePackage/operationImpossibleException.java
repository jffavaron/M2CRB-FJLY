package AssistanceTouristique.ServiceBancairePackage;

/**
 * Exception definition : operationImpossibleException
 * 
 * @author OpenORB Compiler
 */
public final class operationImpossibleException extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public operationImpossibleException()
    {
        super(operationImpossibleExceptionHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public operationImpossibleException(String raison)
    {
        super(operationImpossibleExceptionHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public operationImpossibleException(String orb_reason, String raison)
    {
        super(operationImpossibleExceptionHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
