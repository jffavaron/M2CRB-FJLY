package AssistanceTouristique;

/** 
 * Helper class for : SiteTouristique
 *  
 * @author OpenORB Compiler
 */ 
public class SiteTouristiqueHelper
{
    /**
     * Insert SiteTouristique into an any
     * @param a an any
     * @param t SiteTouristique value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.SiteTouristique t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract SiteTouristique from an any
     * @param a an any
     * @return the extracted SiteTouristique value
     */
    public static AssistanceTouristique.SiteTouristique extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return AssistanceTouristique.SiteTouristiqueHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the SiteTouristique TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"SiteTouristique");
        }
        return _tc;
    }

    /**
     * Return the SiteTouristique IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/SiteTouristique:1.0";

    /**
     * Read SiteTouristique from a marshalled stream
     * @param istream the input stream
     * @return the readed SiteTouristique value
     */
    public static AssistanceTouristique.SiteTouristique read(org.omg.CORBA.portable.InputStream istream)
    {
        return(AssistanceTouristique.SiteTouristique)istream.read_Object(AssistanceTouristique._SiteTouristiqueStub.class);
    }

    /**
     * Write SiteTouristique into a marshalled stream
     * @param ostream the output stream
     * @param value SiteTouristique value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.SiteTouristique value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to SiteTouristique
     * @param obj the CORBA Object
     * @return SiteTouristique Object
     */
    public static SiteTouristique narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof SiteTouristique)
            return (SiteTouristique)obj;

        if (obj._is_a(id()))
        {
            _SiteTouristiqueStub stub = new _SiteTouristiqueStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to SiteTouristique
     * @param obj the CORBA Object
     * @return SiteTouristique Object
     */
    public static SiteTouristique unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof SiteTouristique)
            return (SiteTouristique)obj;

        _SiteTouristiqueStub stub = new _SiteTouristiqueStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
