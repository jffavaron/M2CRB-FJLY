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
     * Struct member codeSite
     */
    public String codeSite;

    /**
     * Struct member titre
     */
    public String titre;

    /**
     * Struct member coord
     */
    public AssistanceTouristique.Coordonnees coord;

    /**
     * Struct member horaireOuverture
     */
    public String horaireOuverture;

    /**
     * Struct member horairesFermeture
     */
    public String horairesFermeture;

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
     * Struct member affluenceCourante
     */
    public float affluenceCourante;

    /**
     * Default constructor
     */
    public Site()
    { }

    /**
     * Constructor with fields initialization
     * @param idSite idSite struct member
     * @param codeSite codeSite struct member
     * @param titre titre struct member
     * @param coord coord struct member
     * @param horaireOuverture horaireOuverture struct member
     * @param horairesFermeture horairesFermeture struct member
     * @param description description struct member
     * @param adresse adresse struct member
     * @param telephone telephone struct member
     * @param affluenceCourante affluenceCourante struct member
     */
    public Site(short idSite, String codeSite, String titre, AssistanceTouristique.Coordonnees coord, String horaireOuverture, String horairesFermeture, String description, String adresse, String telephone, float affluenceCourante)
    {
        this.idSite = idSite;
        this.codeSite = codeSite;
        this.titre = titre;
        this.coord = coord;
        this.horaireOuverture = horaireOuverture;
        this.horairesFermeture = horairesFermeture;
        this.description = description;
        this.adresse = adresse;
        this.telephone = telephone;
        this.affluenceCourante = affluenceCourante;
    }

}
