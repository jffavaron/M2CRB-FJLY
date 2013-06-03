package AssistanceTouristique;

/** 
 * Helper class for : ServiceBancaire
 *  
 * @author OpenORB Compiler
 */ 
public class ServiceBancaireHelper
{
    /**
     * Insert ServiceBancaire into an any
     * @param a an any
     * @param t ServiceBancaire value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.ServiceBancaire t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract ServiceBancaire from an any
     * @param a an any
     * @return the extracted ServiceBancaire value
     */
    public static AssistanceTouristique.ServiceBancaire extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return AssistanceTouristique.ServiceBancaireHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the ServiceBancaire TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"ServiceBancaire");
        }
        return _tc;
    }

    /**
     * Return the ServiceBancaire IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/ServiceBancaire:1.0";

    /**
     * Read ServiceBancaire from a marshalled stream
     * @param istream the input stream
     * @return the readed ServiceBancaire value
     */
    public static AssistanceTouristique.ServiceBancaire read(org.omg.CORBA.portable.InputStream istream)
    {
        return(AssistanceTouristique.ServiceBancaire)istream.read_Object(AssistanceTouristique._ServiceBancaireStub.class);
    }

    /**
     * Write ServiceBancaire into a marshalled stream
     * @param ostream the output stream
     * @param value ServiceBancaire value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.ServiceBancaire value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to ServiceBancaire
     * @param obj the CORBA Object
     * @return ServiceBancaire Object
     */
    public static ServiceBancaire narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceBancaire)
            return (ServiceBancaire)obj;

        if (obj._is_a(id()))
        {
            _ServiceBancaireStub stub = new _ServiceBancaireStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to ServiceBancaire
     * @param obj the CORBA Object
     * @return ServiceBancaire Object
     */
    public static ServiceBancaire unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceBancaire)
            return (ServiceBancaire)obj;

        _ServiceBancaireStub stub = new _ServiceBancaireStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
