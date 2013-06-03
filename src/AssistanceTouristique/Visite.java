package AssistanceTouristique;

/**
 * Struct definition : Visite
 * 
 * @author OpenORB Compiler
*/
public final class Visite implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Struct member date
     */
    public String date;

    /**
     * Struct member heureEntree
     */
    public int heureEntree;

    /**
     * Struct member heureSortie
     */
    public int heureSortie;

    /**
     * Struct member interet
     */
    public String interet;

    /**
     * Default constructor
     */
    public Visite()
    { }

    /**
     * Constructor with fields initialization
     * @param date date struct member
     * @param heureEntree heureEntree struct member
     * @param heureSortie heureSortie struct member
     * @param interet interet struct member
     */
    public Visite(String date, int heureEntree, int heureSortie, String interet)
    {
        this.date = date;
        this.heureEntree = heureEntree;
        this.heureSortie = heureSortie;
        this.interet = interet;
    }

}
