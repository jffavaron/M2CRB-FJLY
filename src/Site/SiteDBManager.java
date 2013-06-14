/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tiphaine
 */
public class SiteDBManager {
    private Connection conn = null;
    private Statement  smt  = null;
    private String nomDB = ""; 
    
    //-- Constructeur
    public SiteDBManager(String nomBD){
        this.nomDB = nomBD;
        try {
            // Connexion
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"+this.nomDB,"root","");
            smt = conn.createStatement();            
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //-- Méthodes
    
    // -- Getters
    public short getIdSite(){
        short idSite = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT idSite FROM InfoSite");
            // récupération des données 
            result.first();
            idSite = result.getShort("idSite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idSite;
    }
    
    public String getNomSite(){
        String nomSite = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT nomSite FROM InfoSite");
            // récupération des données 
            result.first();
            nomSite = result.getString("nomSite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nomSite;
    }
    
    public String getCodeSite(){
        String codeSite = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT codeSite FROM InfoSite");
            // récupération des données 
            result.first();
            codeSite = result.getString("codeSite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codeSite;
    }
        
    public float getCoordLatitudeSite(){
        float coordLatitude = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT coordLatitude FROM InfoSite");
            // récupération des données 
            result.first();
            coordLatitude = result.getFloat("coordLatitude");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coordLatitude;
    }
    
    public float getCoordLongitudeSite(){
        float coordLongitude = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT coordLongitude FROM InfoSite");
            // récupération des données 
            result.first();
            coordLongitude = result.getFloat("coordLongitude");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coordLongitude;
    }
    
    // donnée fictive enregistrée (pour simulation de la réalité)
    public float getAffluenceCouranteSite(){
        float affluenceCourante = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT affluenceCourante FROM InfoSite");
            // récupération des données 
            result.first();
            affluenceCourante = result.getFloat("affluenceCourante");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return affluenceCourante;
    }
         
    public String getHoraireOuvertureSite(){        
        String heureOuverture = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT heureOuverture FROM InfoSite");
            // récupération des données 
            result.first();
            heureOuverture = result.getString("heureOuverture");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return heureOuverture;
    }
    
    public String getHoraireFermetureSite(){
        String heureFermeture = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT heureFermeture FROM InfoSite");
            // récupération des données 
            result.first();
            heureFermeture = result.getString("heureFermeture");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return heureFermeture;
    }
    
    public String getDescriptionSite(){
        String description = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT description FROM InfoSite");
            // récupération des données 
            result.first();
            description = result.getString("description");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return description;
    }
    
    public String getAdresseSite(){
        String adresse = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT adresse FROM InfoSite");
            // récupération des données 
            result.first();
            adresse = result.getString("adresse");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adresse;
    }
    
    public String getTelephoneSite(){
        String telephone = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT telephone FROM InfoSite");
            // récupération des données 
            result.first();
            telephone = result.getString("telephone");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return telephone;
    }
    
    // donnée fictive enregistrée (pour simulation de la réalité)
    public float getAffluenceQuotidienneSite(){
        float affluenceQuotidienne = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT affluenceQuotidienne FROM InfoSite");
            // récupération des données 
            result.first();
            affluenceQuotidienne = result.getFloat("affluenceQuotidienne");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return affluenceQuotidienne;
    }
    
    // calcul de la durée moyenne pour une visite
    public float generateDureeMoyenneVisiteSite(){
        float dureeMoyenneVisite = 0;
        try {
            // requete sql pour avoir la durée moyenne d'une visite en secondes
            ResultSet result = smt.executeQuery("SELECT AVG(TIME_TO_SEC(TIMEDIFF( "
                    + "dateHeureSortie, dateHeureEntree))) AS dureeMoyenneVisite FROM Visites");
            // récupération des données 
            result.first();
            dureeMoyenneVisite = result.getFloat("dureeMoyenneVisite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dureeMoyenneVisite/60 ; // /60 pour avoir la durée en minutes
    }
    
    // calcul de la durée minimale pour une visite
    public float generateDureeMinimaleVisiteSite(){
        float dureeMinimaleVisite = 0;
        try {
            // requete sql pour avoir la durée minimale d'une visite en secondes
            ResultSet result = smt.executeQuery("SELECT MIN(TIME_TO_SEC(TIMEDIFF( "
                    + "dateHeureSortie, dateHeureEntree))) AS dureeMinimaleVisite FROM Visites");
            // récupération des données 
            result.first();
            dureeMinimaleVisite = result.getFloat("dureeMinimaleVisite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dureeMinimaleVisite/60 ; // /60 pour avoir la durée en minutes
    }
    
    // calcul de la durée maximale pour une visite
    public float generateDureeMaximaleVisiteSite(){
        float dureeMaximaleVisite = 0;
        try {
            // requete sql pour avoir la durée maximale d'une visite en secondes
            ResultSet result = smt.executeQuery("SELECT MAX(TIME_TO_SEC(TIMEDIFF( "
                    + "dateHeureSortie, dateHeureEntree))) AS dureeMaximaleVisite FROM Visites");
            // récupération des données 
            result.first();
            dureeMaximaleVisite = result.getFloat("dureeMaximaleVisite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dureeMaximaleVisite/60 ; // /60 pour avoir la durée en minutes
    }
    
    //-- 
    // enregistre l'idCarte comme étant autorisée à entrer dans le site
    // date sous format "dd/mm/YYYY"
    public void autoriserEntree(int idCarte, String dateDebut, String dateFin){
        try {
            if(dateDebut != null && dateFin != null){
                // requete sql insert avec dates
                String query = "INSERT INTO CartesAutorisees VALUES("
                    + idCarte + ",STR_TO_DATE('" + dateDebut + "', '%d/%m/%Y') ,"
                        + "STR_TO_DATE('" + dateFin + "', '%d/%m/%Y'))";
                smt.executeUpdate(query);
            }
            else{
                // requete sql insert sans les dates
                smt.executeUpdate("INSERT INTO CartesAutorisees VALUES("
                    + idCarte + ",null,null)");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // renvoie vrai si l'idCarte passée en paramètre est enregistrée comme autorisée
    public boolean estAutoriseeEntree(int idCarte){
        boolean estAutorisee = false;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT * FROM CartesAutorisees WHERE idCarte = " + idCarte);
            // si une donnée correspond, l'entrée est autorisée, sinon non
            estAutorisee = result.first();
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estAutorisee;
    }
    
    // revoie l'idVisite qui vient d'être initialisée
    public short debuterVisite(short idCarte){
        short idVisite = 0;
        try {
            // requete sql insert 
            String query = "INSERT INTO Visites VALUES(null," + idCarte + 
                    ",NOW() ,null, null)";            
            smt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);                     
            
            // récupère l'idVisite créé
            ResultSet rSetIdGenerees = smt.getGeneratedKeys();
            if (rSetIdGenerees.next()) {
                idVisite = rSetIdGenerees.getShort(1);                
            }            
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idVisite;
    }
    
    // MAJ la visite avec la date de sortie
    public void finirVisite(short idVisite){
        try {
            // requete sql insert 
            String query = "UPDATE Visites SET dateHeureSortie = NOW()"
                    + "WHERE idVisite = " + idVisite;            
            smt.executeUpdate(query);      
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // MAJ la viste en ajoutant l'avis (taux de satisfaction)
    public void setTauxSatisfactionVisite(short idVisite, float tauxSatisfaction){
        try {
            // requete sql insert 
            String query = "UPDATE Visites SET tauxSatisfaction = " + tauxSatisfaction
                    + "WHERE idVisite = " + idVisite;            
            smt.executeUpdate(query);      
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    // revoie le taux de satisfaction moyen des visites du site
    public float generateTauxSatisfactionGlobal(){
        float tauxSatisfaction = 0;
        try {
            // requete sql pour avoir la moyenne des taux des satisfactions des visites
            ResultSet result = smt.executeQuery(
                    "SELECT AVG(tauxSatisfaction) AS tauxSatisfactionMoyen FROM Visites");
            // récupération des données 
            result.first();
            tauxSatisfaction = result.getFloat("tauxSatisfactionMoyen");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tauxSatisfaction; 
    }
    
    // renvoie vrai si le site est considéré comme favori, faux sinon
    // (est considéré comme favori un site qui a + de 75% de taux se satisfaction
    //  et qui a été visité au moins une fois dans la semaine)
    public boolean generateEstFavori(){
        boolean estFavori = false;
        float tauxSatisfaction = this.generateTauxSatisfactionGlobal();
        int nbVisitsThisWeek = 0;
        try {
            // requete sql pour avoir la moyenne des taux des satisfactions des visites
            ResultSet result = smt.executeQuery(
                    "SELECT COUNT(idVisite) AS nbVisitsThisWeek FROM Visites " +
                    "WHERE DATEDIFF(NOW(),dateHeureEntree) <= 7");
            // récupération des données 
            result.first();
            nbVisitsThisWeek = result.getInt("nbVisitsThisWeek");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(tauxSatisfaction >= 75 && nbVisitsThisWeek > 0){
            estFavori = true;
        }
        else{
            estFavori = false;
        }
        return estFavori;
    }    
}

