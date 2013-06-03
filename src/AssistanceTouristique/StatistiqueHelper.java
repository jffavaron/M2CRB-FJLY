package AssistanceTouristique;

/** 
 * Helper class for : Statistique
 *  
 * @author OpenORB Compiler
 */ 
public class StatistiqueHelper
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
     * Insert Statistique into an any
     * @param a an any
     * @param t Statistique value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.Statistique t)
    {
        a.insert_Streamable(new AssistanceTouristique.StatistiqueHolder(t));
    }

    /**
     * Extract Statistique from an any
     * @param a an any
     * @return the extracted Statistique value
     */
    public static AssistanceTouristique.Statistique extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof AssistanceTouristique.StatistiqueHolder)
                    return ((AssistanceTouristique.StatistiqueHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            AssistanceTouristique.StatistiqueHolder h = new AssistanceTouristique.StatistiqueHolder(read(a.create_input_stream()));
            a.insert_Streamable(h);
            return h.value;
        }
        return read(a.create_input_stream());
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;
    private static boolean _working = false;

    /**
     * Return the Statistique TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            synchronized(org.omg.CORBA.TypeCode.class) {
                if (_tc != null)
                    return _tc;
                if (_working)
                    return org.omg.CORBA.ORB.init().create_recursive_tc(id());
                _working = true;
                org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
                org.omg.CORBA.StructMember []_members = new org.omg.CORBA.StructMember[3];

                _members[0] = new org.omg.CORBA.StructMember();
                _members[0].name = "libelleStat";
                _members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
                _members[1] = new org.omg.CORBA.StructMember();
                _members[1].name = "valeurStat";
                _members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
                _members[2] = new org.omg.CORBA.StructMember();
                _members[2].name = "uniteStat";
                _members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
                _tc = orb.create_struct_tc(id(),"Statistique",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the Statistique IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/Statistique:1.0";

    /**
     * Read Statistique from a marshalled stream
     * @param istream the input stream
     * @return the readed Statistique value
     */
    public static AssistanceTouristique.Statistique read(org.omg.CORBA.portable.InputStream istream)
    {
        AssistanceTouristique.Statistique new_one = new AssistanceTouristique.Statistique();

        new_one.libelleStat = istream.read_string();
        new_one.valeurStat = istream.read_long();
        new_one.uniteStat = istream.read_string();

        return new_one;
    }

    /**
     * Write Statistique into a marshalled stream
     * @param ostream the output stream
     * @param value Statistique value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.Statistique value)
    {
        ostream.write_string(value.libelleStat);
        ostream.write_long(value.valeurStat);
        ostream.write_string(value.uniteStat);
    }

}
