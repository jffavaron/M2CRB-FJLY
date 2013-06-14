/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;

import Smartphone.SmartphoneDBManager;
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
public class OfficeDBManager {
    private Connection conn = null;
    private Statement  smt  = null;
    
    //-- Constructeur
    public OfficeDBManager(){
        try {
            // Connexion
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_officetourisme","root","");
            smt = conn.createStatement();            
        } catch (SQLException ex) {
            Logger.getLogger(SmartphoneDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //-- Méthodes    
    // méthode permettant de renvoyer une liste avec les identifiants des sites non visités à partir des sites déjà visité
    public short[] getSitesNonVisites(short[] siteVisites){
        short[] idSitesNonVisites = null;
        int i = 0;
        int nbSitesNonVisites = 0;
        try {  
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT idSite FROM Sites");
        
            // PREMIER PARCOURS : récupère le nombre de sites à visiter            
            int nbSitesVisites = siteVisites.length;
            // pour chaque site existant
            while (result.next()) {
                short idSite = result.getShort("idSite");
                boolean isNotVisited = true;
                // parcours des sites visités
                for(int j = 0 ; j < nbSitesVisites ; j++){
                    // test si le site existant en cours a déjà été visité
                    if(siteVisites[j] == idSite){
                        isNotVisited = false;
                    }                    
                }
                // si le site existant en cours n'a pas déjà été visité, ajout dans le tableau
                if(isNotVisited){
                    nbSitesNonVisites ++;
                }
            }
            // replace au début des résultats
            result.beforeFirst();
            // attribue le nombre de valeurs au tableau
            idSitesNonVisites = new short[nbSitesNonVisites];
            // SECOND PARCOURS : récupère les sites à visiter
            // pour chaque site existant
            while (result.next()) {
                short idSite = result.getShort("idSite");
                boolean isNotVisited = true;
                // parcours des sites visités
                for(int j = 0 ; j < nbSitesVisites ; j++){
                    // test si le site existant en cours a déjà été visité
                    if(siteVisites[j] == idSite){
                        isNotVisited = false;
                    }                    
                }
                // si le site existant en cours n'a pas déjà été visité, ajout dans le tableau
                if(isNotVisited){
                    idSitesNonVisites[i] = idSite;
                    i++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(OfficeDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idSitesNonVisites;
    }
    
    // méthode permettant de renvoyer les identifiants des sites connus
    public short[] getIdSites(){
        // initialisation données        
        int i = 0;
        short idSites[] = null;
        try {  
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT idSite FROM Sites");
        
            // récupération des données            
            if (result.last()) {
                // récupération du nb de résultat de la requête
                int nbValues = result.getRow();
                //initialisation du tableau
                idSites = new short[nbValues];
                // replace au début des résultats
                result.beforeFirst();
            }
            // tant qu'il y a des données
            while (result.next()) {
                idSites[i] = result.getShort("idSite");
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OfficeDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idSites;
    }
    
    // méthode permettant de retourner le nom du site dont l'id est passé en paramètre
    public String getNomSite(short idSite){
        String nomSite = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT nomSite FROM Sites WHERE idSite = " + idSite);
            // récupération des données 
            result.first();
            nomSite = result.getString("nomSite");
        } catch (SQLException ex) {
            Logger.getLogger(OfficeDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nomSite;
    }
    
     // méthode permettant de retourner le code du site dont l'id est passé en paramètre
    public String getCodeSite(short idSite){
        String codeSite = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT codeSite FROM Sites WHERE idSite = " + idSite);
            // récupération des données 
            result.first();
            codeSite = result.getString("codeSite");
        } catch (SQLException ex) {
            Logger.getLogger(OfficeDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codeSite;
    }
}
