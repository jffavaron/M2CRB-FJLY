/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;
import AssistanceTouristique.*;
/**
 *
 * @author Lydia
 */
public class SiteTouristiqueImpl extends SiteTouristiquePOA {
    
    public SiteTouristiqueImpl() {
        
    }
    
    //TODO BD
    public Site getInfoSite(short idSite) {
        
        Site infoSite = new Site();
        Coordonnees coordSite; 
        switch(idSite) {
            //Georges LAbit
            case 1 :
                coordSite = new Coordonnees((float)43.5907, (float)1.45852);
                infoSite = new Site((short)1, "Musée Georges-Labit", coordSite, "10:00:00", "18:00:00", "description", "adresse", "telephone", (short)12);
                break;
            //Museum histoire naturelle    
            case 2 :
                coordSite = new Coordonnees((float)43.5943, (float)1.44924);
                infoSite = new Site((short)2, "Muséum de Toulouse", coordSite, "10:00:00", "18:00:00", "description", "adresse", "telephone", (short)10);
                break;
            //Saint Raymond
            case 3 :
                coordSite = new Coordonnees((float)43.6078, (float)1.44086);
                infoSite = new Site((short)3, "Musée Saint-Raymond", coordSite, "10:00:00", "18:00:00", "description", "adresse", "telephone", (short)19);
                break;
        }
        return infoSite;
        
    }
}
