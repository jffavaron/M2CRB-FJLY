package AssistanceTouristique;

/** 
 * Helper class for : Site
 *  
 * @author OpenORB Compiler
 */ 
public class SiteHelper
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
     * Insert Site into an any
     * @param a an any
     * @param t Site value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.Site t)
    {
        a.insert_Streamable(new AssistanceTouristique.SiteHolder(t));
    }

    /**
     * Extract Site from an any
     * @param a an any
     * @return the extracted Site value
     */
    public static AssistanceTouristique.Site extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof AssistanceTouristique.SiteHolder)
                    return ((AssistanceTouristique.SiteHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            AssistanceTouristique.SiteHolder h = new AssistanceTouristique.SiteHolder(read(a.create_input_stream()));
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
     * Return the Site TypeCode
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
                org.omg.CORBA.StructMember []_members = new org.omg.CORBA.StructMember[4];

                _members[0] = new org.omg.CORBA.StructMember();
                _members[0].name = "nom";
                _members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
                _members[1] = new org.omg.CORBA.StructMember();
                _members[1].name = "coord";
                _members[1].type = AssistanceTouristique.CoordonneesHelper.type();
                _members[2] = new org.omg.CORBA.StructMember();
                _members[2].name = "affluenceCourante";
                _members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
                _members[3] = new org.omg.CORBA.StructMember();
                _members[3].name = "horaireFermeture";
                _members[3].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
                _tc = orb.create_struct_tc(id(),"Site",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the Site IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/Site:1.0";

    /**
     * Read Site from a marshalled stream
     * @param istream the input stream
     * @return the readed Site value
     */
    public static AssistanceTouristique.Site read(org.omg.CORBA.portable.InputStream istream)
    {
        AssistanceTouristique.Site new_one = new AssistanceTouristique.Site();

        new_one.nom = istream.read_string();
        new_one.coord = AssistanceTouristique.CoordonneesHelper.read(istream);
        new_one.affluenceCourante = istream.read_long();
        new_one.horaireFermeture = istream.read_long();

        return new_one;
    }

    /**
     * Write Site into a marshalled stream
     * @param ostream the output stream
     * @param value Site value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.Site value)
    {
        ostream.write_string(value.nom);
        AssistanceTouristique.CoordonneesHelper.write(ostream,value.coord);
        ostream.write_long(value.affluenceCourante);
        ostream.write_long(value.horaireFermeture);
    }

}
