package AssistanceTouristique;

/** 
 * Helper class for : t_listeVisites
 *  
 * @author OpenORB Compiler
 */ 
public class t_listeVisitesHelper
{
    private static final boolean HAS_OPENORB;
    static {
        boolean hasOpenORB = false;
        try {
            Thread.currentThread().getContextClassLoader().loadClass("org.openorb.CORBA.Any");
            hasOpenORB = true;
        }
        catch(ClassNotFoundException ex) {
        }
        HAS_OPENORB = hasOpenORB;
    }
    /**
     * Insert t_listeVisites into an any
     * @param a an any
     * @param t t_listeVisites value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.Visite[] t)
    {
        a.insert_Streamable(new AssistanceTouristique.t_listeVisitesHolder(t));
    }

    /**
     * Extract t_listeVisites from an any
     * @param a an any
     * @return the extracted t_listeVisites value
     */
    public static AssistanceTouristique.Visite[] extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if(HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof AssistanceTouristique.t_listeVisitesHolder)
                    return ((AssistanceTouristique.t_listeVisitesHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            AssistanceTouristique.t_listeVisitesHolder h = new AssistanceTouristique.t_listeVisitesHolder(read(a.create_input_stream()));
            a.insert_Streamable(h);
            return h.value;
        }
        return read(a.create_input_stream());
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the t_listeVisites TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_alias_tc(id(),"t_listeVisites",orb.create_sequence_tc(0,AssistanceTouristique.VisiteHelper.type()));
        }
        return _tc;
    }

    /**
     * Return the t_listeVisites IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/t_listeVisites:1.0";

    /**
     * Read t_listeVisites from a marshalled stream
     * @param istream the input stream
     * @return the readed t_listeVisites value
     */
    public static AssistanceTouristique.Visite[] read(org.omg.CORBA.portable.InputStream istream)
    {
        AssistanceTouristique.Visite[] new_one;
        {
        int size7 = istream.read_ulong();
        new_one = new AssistanceTouristique.Visite[size7];
        for (int i7=0; i7<new_one.length; i7++)
         {
            new_one[i7] = AssistanceTouristique.VisiteHelper.read(istream);

         }
        }

        return new_one;
    }

    /**
     * Write t_listeVisites into a marshalled stream
     * @param ostream the output stream
     * @param value t_listeVisites value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.Visite[] value)
    {
        ostream.write_ulong(value.length);
        for (int i7=0; i7<value.length; i7++)
        {
            AssistanceTouristique.VisiteHelper.write(ostream,value[i7]);

        }
    }

}
