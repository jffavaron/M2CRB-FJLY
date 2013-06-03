package AssistanceTouristique.ServiceESSitePackage;

/**
 * Exception definition : carteNonValideException
 * 
 * @author OpenORB Compiler
 */
public final class carteNonValideException extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public carteNonValideException()
    {
        super(carteNonValideExceptionHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public carteNonValideException(String raison)
    {
        super(carteNonValideExceptionHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public carteNonValideException(String orb_reason, String raison)
    {
        super(carteNonValideExceptionHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
