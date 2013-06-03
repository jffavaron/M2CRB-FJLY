package AssistanceTouristique;

/**
 * Struct definition : Carte
 * 
 * @author OpenORB Compiler
*/
public final class Carte implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Struct member idCarte
     */
    public short idCarte;

    /**
     * Struct member dateDebut
     */
    public String dateDebut;

    /**
     * Struct member dateFin
     */
    public String dateFin;

    /**
     * Default constructor
     */
    public Carte()
    { }

    /**
     * Constructor with fields initialization
     * @param idCarte idCarte struct member
     * @param dateDebut dateDebut struct member
     * @param dateFin dateFin struct member
     */
    public Carte(short idCarte, String dateDebut, String dateFin)
    {
        this.idCarte = idCarte;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

}
