
package kata2;

/**
 *
 * @author airam
 */

import java.util.HashMap;
 import java.util.Iterator;
 import java.util.Map;



public class Kata2 {

    public static void main(String[] args) {
    
        

        Integer[] data = {1, 3, 3, 4, 5, 6, 7, 9, 9, 10, 11, 11, 14, 14, 14};


        Histogram histo = new Histogram(data);
       
        
        HashMap<Integer, Integer> histogr = histo.getHistogram();
        
        
        for (Integer key : histogr.keySet()) {
            
            System.out.println(key + " ==> " + histogr.get(key));
        
        }
    
    }
}
    
    

