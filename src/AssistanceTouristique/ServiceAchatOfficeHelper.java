package AssistanceTouristique;

/** 
 * Helper class for : ServiceAchatOffice
 *  
 * @author OpenORB Compiler
 */ 
public class ServiceAchatOfficeHelper
{
    /**
     * Insert ServiceAchatOffice into an any
     * @param a an any
     * @param t ServiceAchatOffice value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.ServiceAchatOffice t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract ServiceAchatOffice from an any
     * @param a an any
     * @return the extracted ServiceAchatOffice value
     */
    public static AssistanceTouristique.ServiceAchatOffice extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return AssistanceTouristique.ServiceAchatOfficeHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the ServiceAchatOffice TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"ServiceAchatOffice");
        }
        return _tc;
    }

    /**
     * Return the ServiceAchatOffice IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/ServiceAchatOffice:1.0";

    /**
     * Read ServiceAchatOffice from a marshalled stream
     * @param istream the input stream
     * @return the readed ServiceAchatOffice value
     */
    public static AssistanceTouristique.ServiceAchatOffice read(org.omg.CORBA.portable.InputStream istream)
    {
        return(AssistanceTouristique.ServiceAchatOffice)istream.read_Object(AssistanceTouristique._ServiceAchatOfficeStub.class);
    }

    /**
     * Write ServiceAchatOffice into a marshalled stream
     * @param ostream the output stream
     * @param value ServiceAchatOffice value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.ServiceAchatOffice value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to ServiceAchatOffice
     * @param obj the CORBA Object
     * @return ServiceAchatOffice Object
     */
    public static ServiceAchatOffice narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceAchatOffice)
            return (ServiceAchatOffice)obj;

        if (obj._is_a(id()))
        {
            _ServiceAchatOfficeStub stub = new _ServiceAchatOfficeStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to ServiceAchatOffice
     * @param obj the CORBA Object
     * @return ServiceAchatOffice Object
     */
    public static ServiceAchatOffice unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceAchatOffice)
            return (ServiceAchatOffice)obj;

        _ServiceAchatOfficeStub stub = new _ServiceAchatOfficeStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
