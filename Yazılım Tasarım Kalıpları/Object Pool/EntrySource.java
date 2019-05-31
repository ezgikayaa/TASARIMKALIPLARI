/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ezgi
 */
public class EntrySource {
    private static  EntrySource source = new  EntrySource();
    private static Map<Class<? extends Entry> ,Entry> poolMap = new HashMap<>();
    static int size = poolMap.size();
    
    private EntrySource () {
    }
  

    public static Entry getEntry(Class<? extends Entry> clazz) throws IllegalAccessException, InstantiationException {
     
       Entry b = source.poolMap.get(clazz);
     
   
        if (b == null) {
            b = clazz.newInstance();
            source.poolMap.put(b.getClass(), b);
            size++;
                    
        }
        return b;
    
  }
}
