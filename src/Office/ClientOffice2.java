/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;

import AssistanceTouristique.Site;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lydia
 */
public class ClientOffice2 implements Runnable {
    private AssistanceTouristique.Office monOffice;
    private ArrayList<Site> listeSite;
    
    public ClientOffice2(AssistanceTouristique.Office office) {
        monOffice=office;
        listeSite = new ArrayList<Site>();
    }
    
    public void afficherListeSiteAVisiter(ArrayList<Site> listeSitesAVisiter) {
        Iterator<Site> it;     
        it = listeSitesAVisiter.iterator();
            while(it.hasNext()){
                    System.out.println(it.next().toString());    
            }
    }
    
    public void run() {
        System.out.println("Je suis sur le client de l'office");
        listeSite.add(0, new Site("musée 1", null, 12, 17));
        listeSite.add(1, new Site("musée 2", null, 11, 17));
        listeSite.add(2, new Site("musée 3", null, 10, 17));
        listeSite.add(3, new Site("musée 4", null, 9, 17));
        listeSite.add(4, new Site("musée 5", null, 8, 17));
        
        afficherListeSiteAVisiter(listeSite);
   
        try {
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
