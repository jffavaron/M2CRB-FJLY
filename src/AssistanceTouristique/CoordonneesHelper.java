package AssistanceTouristique;

/** 
 * Helper class for : Coordonnees
 *  
 * @author OpenORB Compiler
 */ 
public class CoordonneesHelper
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
     * Insert Coordonnees into an any
     * @param a an any
     * @param t Coordonnees value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.Coordonnees t)
    {
        a.insert_Streamable(new AssistanceTouristique.CoordonneesHolder(t));
    }

    /**
     * Extract Coordonnees from an any
     * @param a an any
     * @return the extracted Coordonnees value
     */
    public static AssistanceTouristique.Coordonnees extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof AssistanceTouristique.CoordonneesHolder)
                    return ((AssistanceTouristique.CoordonneesHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            AssistanceTouristique.CoordonneesHolder h = new AssistanceTouristique.CoordonneesHolder(read(a.create_input_stream()));
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
     * Return the Coordonnees TypeCode
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
                org.omg.CORBA.StructMember []_members = new org.omg.CORBA.StructMember[2];

                _members[0] = new org.omg.CORBA.StructMember();
                _members[0].name = "latitude";
                _members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);
                _members[1] = new org.omg.CORBA.StructMember();
                _members[1].name = "longitude";
                _members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);
                _tc = orb.create_struct_tc(id(),"Coordonnees",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the Coordonnees IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/Coordonnees:1.0";

    /**
     * Read Coordonnees from a marshalled stream
     * @param istream the input stream
     * @return the readed Coordonnees value
     */
    public static AssistanceTouristique.Coordonnees read(org.omg.CORBA.portable.InputStream istream)
    {
        AssistanceTouristique.Coordonnees new_one = new AssistanceTouristique.Coordonnees();

        new_one.latitude = istream.read_float();
        new_one.longitude = istream.read_float();

        return new_one;
    }

    /**
     * Write Coordonnees into a marshalled stream
     * @param ostream the output stream
     * @param value Coordonnees value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.Coordonnees value)
    {
        ostream.write_float(value.latitude);
        ostream.write_float(value.longitude);
    }

}
