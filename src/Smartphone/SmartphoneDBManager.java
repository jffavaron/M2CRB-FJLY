/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Smartphone;

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
public class SmartphoneDBManager {
    private Connection conn = null;
    private Statement  smt  = null;
    
    //-- Constructeur
    public SmartphoneDBManager(){
        try {
            // Connexion
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_smartphone","root","");
            smt = conn.createStatement();            
        } catch (SQLException ex) {
            Logger.getLogger(SmartphoneDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //-- Méthodes
    // méthode permettant de renvoyer un tableau contenant les identifiants de sites visités
    public short[] getSitesVisites(){       
        // initialisation données        
        int i = 0;
        short idSites[] = null;
        try {  
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT idSiteVisite FROM Visites GROUP BY idSiteVisite");
        
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
                idSites[i] = result.getShort("idSiteVisite");
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SmartphoneDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idSites;
    }
}
