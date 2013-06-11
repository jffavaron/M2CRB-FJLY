package AssistanceTouristique;

/**
 * Struct definition : Site
 * 
 * @author OpenORB Compiler
*/
public final class Site implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Struct member idSite
     */
    public short idSite;

    /**
     * Struct member titre
     */
    public String titre;

    /**
     * Struct member coord
     */
    public AssistanceTouristique.Coordonnees coord;

    /**
     * Struct member horaire0uverture
     */
    public String horaire0uverture;

    /**
     * Struct member horaireFermeture
     */
    public String horaireFermeture;

    /**
     * Struct member description
     */
    public String description;

    /**
     * Struct member adresse
     */
    public String adresse;

    /**
     * Struct member telephone
     */
    public String telephone;

    /**
     * Default constructor
     */
    public Site()
    { }

    /**
     * Constructor with fields initialization
     * @param idSite idSite struct member
     * @param titre titre struct member
     * @param coord coord struct member
     * @param horaire0uverture horaire0uverture struct member
     * @param horaireFermeture horaireFermeture struct member
     * @param description description struct member
     * @param adresse adresse struct member
     * @param telephone telephone struct member
     */
    public Site(short idSite, String titre, AssistanceTouristique.Coordonnees coord, String horaire0uverture, String horaireFermeture, String description, String adresse, String telephone)
    {
        this.idSite = idSite;
        this.titre = titre;
        this.coord = coord;
        this.horaire0uverture = horaire0uverture;
        this.horaireFermeture = horaireFermeture;
        this.description = description;
        this.adresse = adresse;
        this.telephone = telephone;
    }

}
