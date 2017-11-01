/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoca;
import java.util.ArrayList;


/**
 *
 * @author Cale
 */
public class YOCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();
        
        test.add("One");
        test.add("Two");
        test.add("Three");
        
        String hope = test.toString();
        
        System.out.println(hope);
        
        String[] faith = hope.split("[\\[\\], ]");
        
        for (int i = 0; i < faith.length; i++) {
            System.out.println(faith[i]);
            //new GUI(); // This is currently used as an example. This will be refined later for actual purpose
        }
    }
    
}
