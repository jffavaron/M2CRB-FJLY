package AssistanceTouristique;

/** 
 * Helper class for : Office
 *  
 * @author OpenORB Compiler
 */ 
public class OfficeHelper
{
    /**
     * Insert Office into an any
     * @param a an any
     * @param t Office value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.Office t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract Office from an any
     * @param a an any
     * @return the extracted Office value
     */
    public static AssistanceTouristique.Office extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return AssistanceTouristique.OfficeHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the Office TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"Office");
        }
        return _tc;
    }

    /**
     * Return the Office IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/Office:1.0";

    /**
     * Read Office from a marshalled stream
     * @param istream the input stream
     * @return the readed Office value
     */
    public static AssistanceTouristique.Office read(org.omg.CORBA.portable.InputStream istream)
    {
        return(AssistanceTouristique.Office)istream.read_Object(AssistanceTouristique._OfficeStub.class);
    }

    /**
     * Write Office into a marshalled stream
     * @param ostream the output stream
     * @param value Office value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.Office value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to Office
     * @param obj the CORBA Object
     * @return Office Object
     */
    public static Office narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof Office)
            return (Office)obj;

        if (obj._is_a(id()))
        {
            _OfficeStub stub = new _OfficeStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to Office
     * @param obj the CORBA Object
     * @return Office Object
     */
    public static Office unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof Office)
            return (Office)obj;

        _OfficeStub stub = new _OfficeStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
