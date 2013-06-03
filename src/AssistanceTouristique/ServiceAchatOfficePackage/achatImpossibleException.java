package AssistanceTouristique.ServiceAchatOfficePackage;

/**
 * Exception definition : achatImpossibleException
 * 
 * @author OpenORB Compiler
 */
public final class achatImpossibleException extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public achatImpossibleException()
    {
        super(achatImpossibleExceptionHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public achatImpossibleException(String raison)
    {
        super(achatImpossibleExceptionHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public achatImpossibleException(String orb_reason, String raison)
    {
        super(achatImpossibleExceptionHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
