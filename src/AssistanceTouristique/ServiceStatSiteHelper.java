package AssistanceTouristique;

/** 
 * Helper class for : ServiceStatSite
 *  
 * @author OpenORB Compiler
 */ 
public class ServiceStatSiteHelper
{
    /**
     * Insert ServiceStatSite into an any
     * @param a an any
     * @param t ServiceStatSite value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.ServiceStatSite t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract ServiceStatSite from an any
     * @param a an any
     * @return the extracted ServiceStatSite value
     */
    public static AssistanceTouristique.ServiceStatSite extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return AssistanceTouristique.ServiceStatSiteHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the ServiceStatSite TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"ServiceStatSite");
        }
        return _tc;
    }

    /**
     * Return the ServiceStatSite IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/ServiceStatSite:1.0";

    /**
     * Read ServiceStatSite from a marshalled stream
     * @param istream the input stream
     * @return the readed ServiceStatSite value
     */
    public static AssistanceTouristique.ServiceStatSite read(org.omg.CORBA.portable.InputStream istream)
    {
        return(AssistanceTouristique.ServiceStatSite)istream.read_Object(AssistanceTouristique._ServiceStatSiteStub.class);
    }

    /**
     * Write ServiceStatSite into a marshalled stream
     * @param ostream the output stream
     * @param value ServiceStatSite value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.ServiceStatSite value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to ServiceStatSite
     * @param obj the CORBA Object
     * @return ServiceStatSite Object
     */
    public static ServiceStatSite narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceStatSite)
            return (ServiceStatSite)obj;

        if (obj._is_a(id()))
        {
            _ServiceStatSiteStub stub = new _ServiceStatSiteStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to ServiceStatSite
     * @param obj the CORBA Object
     * @return ServiceStatSite Object
     */
    public static ServiceStatSite unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceStatSite)
            return (ServiceStatSite)obj;

        _ServiceStatSiteStub stub = new _ServiceStatSiteStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
