package AssistanceTouristique.ServiceDeplacementPackage;

/** 
 * Helper class for : coordNonValidesException
 *  
 * @author OpenORB Compiler
 */ 
public class coordNonValidesExceptionHelper
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
     * Insert coordNonValidesException into an any
     * @param a an any
     * @param t coordNonValidesException value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesException t)
    {
        a.insert_Streamable(new AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesExceptionHolder(t));
    }

    /**
     * Extract coordNonValidesException from an any
     * @param a an any
     * @return the extracted coordNonValidesException value
     */
    public static AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesException extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesExceptionHolder)
                    return ((AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesExceptionHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesExceptionHolder h = new AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesExceptionHolder(read(a.create_input_stream()));
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
     * Return the coordNonValidesException TypeCode
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
                org.omg.CORBA.StructMember []_members = new org.omg.CORBA.StructMember[1];

                _members[0] = new org.omg.CORBA.StructMember();
                _members[0].name = "raison";
                _members[0].type = AssistanceTouristique.t_raisonHelper.type();
                _tc = orb.create_exception_tc(id(),"coordNonValidesException",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the coordNonValidesException IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/ServiceDeplacement/coordNonValidesException:1.0";

    /**
     * Read coordNonValidesException from a marshalled stream
     * @param istream the input stream
     * @return the readed coordNonValidesException value
     */
    public static AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesException read(org.omg.CORBA.portable.InputStream istream)
    {
        AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesException new_one = new AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesException();

        if (!istream.read_string().equals(id()))
         throw new org.omg.CORBA.MARSHAL();
        new_one.raison = AssistanceTouristique.t_raisonHelper.read(istream);

        return new_one;
    }

    /**
     * Write coordNonValidesException into a marshalled stream
     * @param ostream the output stream
     * @param value coordNonValidesException value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.ServiceDeplacementPackage.coordNonValidesException value)
    {
        ostream.write_string(id());
        AssistanceTouristique.t_raisonHelper.write(ostream,value.raison);
    }

}
