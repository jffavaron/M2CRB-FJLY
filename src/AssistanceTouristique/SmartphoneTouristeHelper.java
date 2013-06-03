package AssistanceTouristique;

/** 
 * Helper class for : SmartphoneTouriste
 *  
 * @author OpenORB Compiler
 */ 
public class SmartphoneTouristeHelper
{
    /**
     * Insert SmartphoneTouriste into an any
     * @param a an any
     * @param t SmartphoneTouriste value
     */
    public static void insert(org.omg.CORBA.Any a, AssistanceTouristique.SmartphoneTouriste t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract SmartphoneTouriste from an any
     * @param a an any
     * @return the extracted SmartphoneTouriste value
     */
    public static AssistanceTouristique.SmartphoneTouriste extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return AssistanceTouristique.SmartphoneTouristeHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the SmartphoneTouriste TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"SmartphoneTouriste");
        }
        return _tc;
    }

    /**
     * Return the SmartphoneTouriste IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:AssistanceTouristique/SmartphoneTouriste:1.0";

    /**
     * Read SmartphoneTouriste from a marshalled stream
     * @param istream the input stream
     * @return the readed SmartphoneTouriste value
     */
    public static AssistanceTouristique.SmartphoneTouriste read(org.omg.CORBA.portable.InputStream istream)
    {
        return(AssistanceTouristique.SmartphoneTouriste)istream.read_Object(AssistanceTouristique._SmartphoneTouristeStub.class);
    }

    /**
     * Write SmartphoneTouriste into a marshalled stream
     * @param ostream the output stream
     * @param value SmartphoneTouriste value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, AssistanceTouristique.SmartphoneTouriste value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to SmartphoneTouriste
     * @param obj the CORBA Object
     * @return SmartphoneTouriste Object
     */
    public static SmartphoneTouriste narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof SmartphoneTouriste)
            return (SmartphoneTouriste)obj;

        if (obj._is_a(id()))
        {
            _SmartphoneTouristeStub stub = new _SmartphoneTouristeStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to SmartphoneTouriste
     * @param obj the CORBA Object
     * @return SmartphoneTouriste Object
     */
    public static SmartphoneTouriste unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof SmartphoneTouriste)
            return (SmartphoneTouriste)obj;

        _SmartphoneTouristeStub stub = new _SmartphoneTouristeStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
