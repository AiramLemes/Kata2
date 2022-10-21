
package kata2;

import java.util.HashMap;

/**
 *
 * @author airam
 */
 public class Histogram<T> {
    
    
    private final T[] data;

    
    
    public Histogram(T[] data) {
        
        this.data = data;
        
    }
    
    
    
    public T[] getData() {
        return data;
    }
    
    
    
    
    public HashMap<Integer, Integer> getHistogram() {
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (T key : data) {
            histogram.put((Integer)key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
         
        return histogram;
    }

   
}
