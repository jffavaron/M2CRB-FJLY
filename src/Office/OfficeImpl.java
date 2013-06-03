/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;
import AssistanceTouristique.*;

import org.omg.CORBA.*; 
import org.omg.PortableServer.*; 
import org.omg.CosNaming.*; 
import org.omg.CosNaming.NamingContextPackage.*;

/**
 *
 * @author Lydia
 */
public class OfficeImpl extends OfficePOA {
   
    public OfficeImpl() {
        
    }
            
    public Site[] getListeSitesAVisiter(short idCarte, Coordonnees coordGPS, Site[] listeSitesVisites) {
        return null;
        
    }
    
}
