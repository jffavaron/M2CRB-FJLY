package AssistanceTouristique;

/** 
 * Helper class for : Visite
 *  
 * @author OpenORB Compiler
 */ 
public class VisiteHelper
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
     * Insert Visite into an any
     * @param a an any
     * @param t Visite value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.Visite t)
    {
        a.insert_Streamable(new AssistanceTouristique.VisiteHolder(t));
    }

    /**
     * Extract Visite from an any
     * @param a an any
     * @return the extracted Visite value
     */
    public static AssistanceTouristique.Visite extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof AssistanceTouristique.VisiteHolder)
                    return ((AssistanceTouristique.VisiteHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            AssistanceTouristique.VisiteHolder h = new AssistanceTouristique.VisiteHolder(read(a.create_input_stream()));
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
     * Return the Visite TypeCode
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
                org.omg.CORBA.StructMember []_members = new org.omg.CORBA.StructMember[5];

                _members[0] = new org.omg.CORBA.StructMember();
                _members[0].name = "idVisite";
                _members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_short);
                _members[1] = new org.omg.CORBA.StructMember();
                _members[1].name = "date";
                _members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
                _members[2] = new org.omg.CORBA.StructMember();
                _members[2].name = "heureEntree";
                _members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
                _members[3] = new org.omg.CORBA.StructMember();
                _members[3].name = "heureSortie";
                _members[3].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
                _members[4] = new org.omg.CORBA.StructMember();
                _members[4].name = "interet";
                _members[4].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);
                _tc = orb.create_struct_tc(id(),"Visite",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the Visite IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/Visite:1.0";

    /**
     * Read Visite from a marshalled stream
     * @param istream the input stream
     * @return the readed Visite value
     */
    public static AssistanceTouristique.Visite read(org.omg.CORBA.portable.InputStream istream)
    {
        AssistanceTouristique.Visite new_one = new AssistanceTouristique.Visite();

        new_one.idVisite = istream.read_short();
        new_one.date = istream.read_string();
        new_one.heureEntree = istream.read_string();
        new_one.heureSortie = istream.read_string();
        new_one.interet = istream.read_float();

        return new_one;
    }

    /**
     * Write Visite into a marshalled stream
     * @param ostream the output stream
     * @param value Visite value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.Visite value)
    {
        ostream.write_short(value.idVisite);
        ostream.write_string(value.date);
        ostream.write_string(value.heureEntree);
        ostream.write_string(value.heureSortie);
        ostream.write_float(value.interet);
    }

}
