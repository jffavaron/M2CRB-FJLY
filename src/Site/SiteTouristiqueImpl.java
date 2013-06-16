/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;
import AssistanceTouristique.*;
import org.omg.CosNaming.NamingContext;
/**
 *
 * @author Lydia
 */
public class SiteTouristiqueImpl extends SiteTouristiquePOA {
    private String nombd;
    private SiteDBManager db;
    
    public SiteTouristiqueImpl(String nombd) {
       this.nombd = nombd;
       this.db = new SiteDBManager(this.nombd);  
    }
    
    // Méthode permettant de récupérer les infos générales du Site
    public Site getInfoSite() {
   
        short id = this.db.getIdSite();
        String code = this.db.getCodeSite();
        String nom = this.db.getNomSite();
        float latitude = this.db.getCoordLatitudeSite();
        float longitude = this.db.getCoordLongitudeSite();
        Coordonnees coordSite = new Coordonnees(latitude, longitude);        
        String horaireOuverture = this.db.getHoraireOuvertureSite();
        String horaireFermeture = this.db.getHoraireFermetureSite();
        String description = this.db.getDescriptionSite();
        String adresse = this.db.getAdresseSite();
        String tel = this.db.getTelephoneSite();
        
        Site infoSite = new Site(id, code, nom, coordSite, horaireOuverture, horaireFermeture, description, adresse, tel, 0);
        
        ////Site infoSite = new Site((short)1, "titre", coordSite, "a", nomSite, nomSite, nomSite, nomSite, (float)13.45);
        return infoSite;     
    }
}
