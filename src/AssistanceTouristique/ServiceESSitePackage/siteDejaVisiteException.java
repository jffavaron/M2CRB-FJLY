package AssistanceTouristique.ServiceESSitePackage;

/**
 * Exception definition : siteDejaVisiteException
 * 
 * @author OpenORB Compiler
 */
public final class siteDejaVisiteException extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public siteDejaVisiteException()
    {
        super(siteDejaVisiteExceptionHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public siteDejaVisiteException(String raison)
    {
        super(siteDejaVisiteExceptionHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public siteDejaVisiteException(String orb_reason, String raison)
    {
        super(siteDejaVisiteExceptionHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
