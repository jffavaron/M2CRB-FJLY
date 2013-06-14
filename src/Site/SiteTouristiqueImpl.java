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
    private String nomSite;
    private String nombd;
    private SiteDBManager db;
    
    public SiteTouristiqueImpl(String nomSite, String nombd) {
       this.nomSite = nomSite;
       this.nombd = nombd;
       this.db = new SiteDBManager(this.nombd);
    }
    
    // Méthode permettant de récupérer les infos générales du Site
    public Site getInfoSite() {
   
        short id = this.db.getIdSite();
        String nom = this.db.getNomSite();
        float latitude = this.db.getCoordLatitudeSite();
        float longitude = this.db.getCoordLongitudeSite();
        Coordonnees coordSite = new Coordonnees(latitude, longitude);        
        String horaireOuverture = this.db.getHoraireOuvertureSite();
        String horaireFermeture = this.db.getHoraireFermetureSite();
        String description = this.db.getDescriptionSite();
        String adresse = this.db.getAdresseSite();
        String tel = this.db.getTelephoneSite();
        float affluenceCourante = this.db.getAffluenceCouranteSite();
        
        Site infoSite = new Site(id, nom, coordSite, horaireOuverture, horaireFermeture, description, adresse, tel, affluenceCourante);
        
        ////Site infoSite = new Site((short)1, "titre", coordSite, "a", nomSite, nomSite, nomSite, nomSite, (float)13.45);
        return infoSite;     
    }
}
