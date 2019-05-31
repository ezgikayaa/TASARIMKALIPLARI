/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern4;

/**
 *
 * @author Ezgi
 */
interface Iterator {
    public boolean hasNext();
    public Object next();
}
interface Container {
   public Iterator getIterator();
}

 class EntryRepository  implements Container {
   public String entrys[] = {"Siyaset" , "Edebiyat" ,"Bilim" , "Seyahat"};

   @Override
   public Iterator getIterator() {
      return new EntryIterator();
   }

   private class EntryIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < entrys.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return entrys[index++];
         }
         return null;
      }		
   }
}



 public class IteratorDeseni {
	
   public static void main(String[] args) {
     EntryRepository namesRepository = new EntryRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String entry = (String)iter.next();
         System.out.println("Entry : " + entry);
      } 	
   }
}