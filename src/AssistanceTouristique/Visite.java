package AssistanceTouristique;

/**
 * Struct definition : Visite
 * 
 * @author OpenORB Compiler
*/
public final class Visite implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Struct member idVisite
     */
    public short idVisite;

    /**
     * Struct member date
     */
    public String date;

    /**
     * Struct member heureEntree
     */
    public String heureEntree;

    /**
     * Struct member heureSortie
     */
    public String heureSortie;

    /**
     * Struct member interet
     */
    public float interet;

    /**
     * Default constructor
     */
    public Visite()
    { }

    /**
     * Constructor with fields initialization
     * @param idVisite idVisite struct member
     * @param date date struct member
     * @param heureEntree heureEntree struct member
     * @param heureSortie heureSortie struct member
     * @param interet interet struct member
     */
    public Visite(short idVisite, String date, String heureEntree, String heureSortie, float interet)
    {
        this.idVisite = idVisite;
        this.date = date;
        this.heureEntree = heureEntree;
        this.heureSortie = heureSortie;
        this.interet = interet;
    }

}
