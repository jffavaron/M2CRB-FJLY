package AssistanceTouristique;

/**
 * Struct definition : Statistique
 * 
 * @author OpenORB Compiler
*/
public final class Statistique implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Struct member libelleStat
     */
    public String libelleStat;

    /**
     * Struct member valeurStat
     */
    public int valeurStat;

    /**
     * Struct member uniteStat
     */
    public String uniteStat;

    /**
     * Default constructor
     */
    public Statistique()
    { }

    /**
     * Constructor with fields initialization
     * @param libelleStat libelleStat struct member
     * @param valeurStat valeurStat struct member
     * @param uniteStat uniteStat struct member
     */
    public Statistique(String libelleStat, int valeurStat, String uniteStat)
    {
        this.libelleStat = libelleStat;
        this.valeurStat = valeurStat;
        this.uniteStat = uniteStat;
    }

}
