package AssistanceTouristique.ServiceDeplacementPackage;

/**
 * Exception definition : coordNonValidesException
 * 
 * @author OpenORB Compiler
 */
public final class coordNonValidesException extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public coordNonValidesException()
    {
        super(coordNonValidesExceptionHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public coordNonValidesException(String raison)
    {
        super(coordNonValidesExceptionHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public coordNonValidesException(String orb_reason, String raison)
    {
        super(coordNonValidesExceptionHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
