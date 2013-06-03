package AssistanceTouristique;

/** 
 * Helper class for : ServiceDeplacement
 *  
 * @author OpenORB Compiler
 */ 
public class ServiceDeplacementHelper
{
    /**
     * Insert ServiceDeplacement into an any
     * @param a an any
     * @param t ServiceDeplacement value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.ServiceDeplacement t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract ServiceDeplacement from an any
     * @param a an any
     * @return the extracted ServiceDeplacement value
     */
    public static AssistanceTouristique.ServiceDeplacement extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return AssistanceTouristique.ServiceDeplacementHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the ServiceDeplacement TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"ServiceDeplacement");
        }
        return _tc;
    }

    /**
     * Return the ServiceDeplacement IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/ServiceDeplacement:1.0";

    /**
     * Read ServiceDeplacement from a marshalled stream
     * @param istream the input stream
     * @return the readed ServiceDeplacement value
     */
    public static AssistanceTouristique.ServiceDeplacement read(org.omg.CORBA.portable.InputStream istream)
    {
        return(AssistanceTouristique.ServiceDeplacement)istream.read_Object(AssistanceTouristique._ServiceDeplacementStub.class);
    }

    /**
     * Write ServiceDeplacement into a marshalled stream
     * @param ostream the output stream
     * @param value ServiceDeplacement value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.ServiceDeplacement value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to ServiceDeplacement
     * @param obj the CORBA Object
     * @return ServiceDeplacement Object
     */
    public static ServiceDeplacement narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceDeplacement)
            return (ServiceDeplacement)obj;

        if (obj._is_a(id()))
        {
            _ServiceDeplacementStub stub = new _ServiceDeplacementStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to ServiceDeplacement
     * @param obj the CORBA Object
     * @return ServiceDeplacement Object
     */
    public static ServiceDeplacement unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceDeplacement)
            return (ServiceDeplacement)obj;

        _ServiceDeplacementStub stub = new _ServiceDeplacementStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
