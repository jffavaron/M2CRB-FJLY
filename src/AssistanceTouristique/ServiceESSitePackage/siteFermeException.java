package AssistanceTouristique.ServiceESSitePackage;

/**
 * Exception definition : siteFermeException
 * 
 * @author OpenORB Compiler
 */
public final class siteFermeException extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public siteFermeException()
    {
        super(siteFermeExceptionHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public siteFermeException(String raison)
    {
        super(siteFermeExceptionHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public siteFermeException(String orb_reason, String raison)
    {
        super(siteFermeExceptionHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
