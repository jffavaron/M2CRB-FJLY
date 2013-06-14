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
       
       //Recherche de l'office distante
       //appel de la methode enregistrerSiteVersOffice(Site)
       //this.office.enregistrerSiteVersOffice(Site)
    }
    
    //TODO BD
    public Site getInfoSite() {
   
        float latitude = this.db.getCoordLatitudeSite();
        float longitude = this.db.getCoordLongitudeSite();
        Coordonnees coordSite = new Coordonnees(latitude, longitude);
        
        Site infoSite = new Site(this.db.getIdSite(), this.db.getNomSite(),
                                 coordSite, this.db.getHoraireOuvertureSite(),
                                 this.db.getHoraireFermetureSite(), this.db.getDescriptionSite(),
                                 this.db.getAdresseSite(), this.db.getTelephoneSite(),
                                 this.db.getAffluenceCouranteSite());
        
        ////Site infoSite = new Site((short)1, "titre", coordSite, "a", nomSite, nomSite, nomSite, nomSite, (float)13.45);
        return infoSite;     
    }
}
