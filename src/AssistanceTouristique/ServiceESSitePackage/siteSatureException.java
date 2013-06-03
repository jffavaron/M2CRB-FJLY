package AssistanceTouristique.ServiceESSitePackage;

/**
 * Exception definition : siteSatureException
 * 
 * @author OpenORB Compiler
 */
public final class siteSatureException extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public siteSatureException()
    {
        super(siteSatureExceptionHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public siteSatureException(String raison)
    {
        super(siteSatureExceptionHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public siteSatureException(String orb_reason, String raison)
    {
        super(siteSatureExceptionHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
