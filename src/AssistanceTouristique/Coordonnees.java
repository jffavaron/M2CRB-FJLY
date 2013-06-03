package AssistanceTouristique;

/**
 * Struct definition : Coordonnees
 * 
 * @author OpenORB Compiler
*/
public final class Coordonnees implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Struct member latitude
     */
    public float latitude;

    /**
     * Struct member longitude
     */
    public float longitude;

    /**
     * Default constructor
     */
    public Coordonnees()
    { }

    /**
     * Constructor with fields initialization
     * @param latitude latitude struct member
     * @param longitude longitude struct member
     */
    public Coordonnees(float latitude, float longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
