/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern2;



/**
 *
 * @author Ezgi
 */
abstract class Entry {
        public String type() {
        return "Entry";
    }     
}
 class Siyaset extends Entry{
    @Override
    public String type() {
        return "Siyaset";
    }
 }  
class Bilim extends Entry{

    @Override
    public String type() {
        return "Bilim";
    }
}
  class Seyahat extends Entry{

    @Override
    public String type() {
        return "Seyahat";
    }
}
    
class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Entry entry = EntrySource.getEntry(Siyaset.class);
        System.out.println(entry.type() + " " + entry.toString());
        Entry entry2 = EntrySource.getEntry(Seyahat.class);
        System.out.println(entry2.type() + " " + entry2.toString());
        Entry entry3 = EntrySource.getEntry(Bilim.class);
        System.out.println(entry3.type() + " " + entry3.toString());

    }
}