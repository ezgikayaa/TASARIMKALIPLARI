/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

/**
 *
 * @author Ezgi
 */
public class EntryFactory {
      public static EntryKategorisi createEntry(Class aClass) throws IllegalAccessException, InstantiationException {
            return (EntryKategorisi) aClass.newInstance();
    }
    
}
