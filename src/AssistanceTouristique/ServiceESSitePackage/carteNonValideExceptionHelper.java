package AssistanceTouristique.ServiceESSitePackage;

/** 
 * Helper class for : carteNonValideException
 *  
 * @author OpenORB Compiler
 */ 
public class carteNonValideExceptionHelper
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
     * Insert carteNonValideException into an any
     * @param a an any
     * @param t carteNonValideException value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.ServiceESSitePackage.carteNonValideException t)
    {
        a.insert_Streamable(new AssistanceTouristique.ServiceESSitePackage.carteNonValideExceptionHolder(t));
    }

    /**
     * Extract carteNonValideException from an any
     * @param a an any
     * @return the extracted carteNonValideException value
     */
    public static AssistanceTouristique.ServiceESSitePackage.carteNonValideException extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof AssistanceTouristique.ServiceESSitePackage.carteNonValideExceptionHolder)
                    return ((AssistanceTouristique.ServiceESSitePackage.carteNonValideExceptionHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            AssistanceTouristique.ServiceESSitePackage.carteNonValideExceptionHolder h = new AssistanceTouristique.ServiceESSitePackage.carteNonValideExceptionHolder(read(a.create_input_stream()));
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
     * Return the carteNonValideException TypeCode
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
                _tc = orb.create_exception_tc(id(),"carteNonValideException",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the carteNonValideException IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/ServiceESSite/carteNonValideException:1.0";

    /**
     * Read carteNonValideException from a marshalled stream
     * @param istream the input stream
     * @return the readed carteNonValideException value
     */
    public static AssistanceTouristique.ServiceESSitePackage.carteNonValideException read(org.omg.CORBA.portable.InputStream istream)
    {
        AssistanceTouristique.ServiceESSitePackage.carteNonValideException new_one = new AssistanceTouristique.ServiceESSitePackage.carteNonValideException();

        if (!istream.read_string().equals(id()))
         throw new org.omg.CORBA.MARSHAL();
        new_one.raison = AssistanceTouristique.t_raisonHelper.read(istream);

        return new_one;
    }

    /**
     * Write carteNonValideException into a marshalled stream
     * @param ostream the output stream
     * @param value carteNonValideException value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.ServiceESSitePackage.carteNonValideException value)
    {
        ostream.write_string(id());
        AssistanceTouristique.t_raisonHelper.write(ostream,value.raison);
    }

}
