/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata2;

import java.util.HashMap;

/**
 *
 * @author airam
 */
public class Histogram {
    
    private final int[] data;

    
    
    public Histogram(int[] data) {
        
        this.data = data;
        
    }
    
    
    
    public int[] getData() {
        return data;
    }
    
    
    
    
    public HashMap<Integer, Integer> getHistogram() {
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
         
        return histogram;
    }
}
