
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
    
        int[] data = {1, 3, 3, 4, 5, 6, 7, 9, 9, 10, 11, 11, 14, 14, 14};

        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();

        
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        
        

        
        for (Integer key : histogram.keySet()) {
            
            System.out.println(key + " ==> " + histogram.get(key));
        
        }
    
    }
}
