package AssistanceTouristique;

/**
 * Struct definition : Site
 * 
 * @author OpenORB Compiler
*/
public final class Site implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Struct member nom
     */
    public String nom;

    /**
     * Struct member coord
     */
    public AssistanceTouristique.Coordonnees coord;

    /**
     * Struct member affluenceCourante
     */
    public int affluenceCourante;

    /**
     * Struct member horaireFermeture
     */
    public int horaireFermeture;

    /**
     * Default constructor
     */
    public Site()
    { }

    /**
     * Constructor with fields initialization
     * @param nom nom struct member
     * @param coord coord struct member
     * @param affluenceCourante affluenceCourante struct member
     * @param horaireFermeture horaireFermeture struct member
     */
    public Site(String nom, AssistanceTouristique.Coordonnees coord, int affluenceCourante, int horaireFermeture)
    {
        this.nom = nom;
        this.coord = coord;
        this.affluenceCourante = affluenceCourante;
        this.horaireFermeture = horaireFermeture;
    }

}
