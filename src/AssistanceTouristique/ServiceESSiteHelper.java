package AssistanceTouristique;

/** 
 * Helper class for : ServiceESSite
 *  
 * @author OpenORB Compiler
 */ 
public class ServiceESSiteHelper
{
    /**
     * Insert ServiceESSite into an any
     * @param a an any
     * @param t ServiceESSite value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.ServiceESSite t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract ServiceESSite from an any
     * @param a an any
     * @return the extracted ServiceESSite value
     */
    public static AssistanceTouristique.ServiceESSite extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return AssistanceTouristique.ServiceESSiteHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the ServiceESSite TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"ServiceESSite");
        }
        return _tc;
    }

    /**
     * Return the ServiceESSite IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/ServiceESSite:1.0";

    /**
     * Read ServiceESSite from a marshalled stream
     * @param istream the input stream
     * @return the readed ServiceESSite value
     */
    public static AssistanceTouristique.ServiceESSite read(org.omg.CORBA.portable.InputStream istream)
    {
        return(AssistanceTouristique.ServiceESSite)istream.read_Object(AssistanceTouristique._ServiceESSiteStub.class);
    }

    /**
     * Write ServiceESSite into a marshalled stream
     * @param ostream the output stream
     * @param value ServiceESSite value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.ServiceESSite value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to ServiceESSite
     * @param obj the CORBA Object
     * @return ServiceESSite Object
     */
    public static ServiceESSite narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceESSite)
            return (ServiceESSite)obj;

        if (obj._is_a(id()))
        {
            _ServiceESSiteStub stub = new _ServiceESSiteStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to ServiceESSite
     * @param obj the CORBA Object
     * @return ServiceESSite Object
     */
    public static ServiceESSite unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceESSite)
            return (ServiceESSite)obj;

        _ServiceESSiteStub stub = new _ServiceESSiteStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
