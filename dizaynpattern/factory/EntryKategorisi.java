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
public interface EntryKategorisi {
   void Sirala();
   
}

 class siyaset implements EntryKategorisi {

      @Override
    public void Sirala() {
        System.out.println("Siyaset ile ilgili entryler sıralandı");
    }
}
class spor implements EntryKategorisi {
    
     @Override
    public void Sirala() {
        System.out.println("Spor ile ilgili entryler sıralandı");
    }
  
}
 class seyahat implements EntryKategorisi {

    @Override
    public void Sirala() {
        System.out.println("Seyahat ile ilgili entryler sıralandı");
    }

}
class bilim implements EntryKategorisi {

     @Override
    public void Sirala() {
        System.out.println("Bilim ile ilgili entryler sıralandı");
    }

}
class edebiyat implements EntryKategorisi {
   @Override
    public void Sirala() {
        System.out.println("Edebiyat ile ilgili entryler sıralandı");
    }
   

}

class Main {

    public static void main(String[] args) {

        try {
            siyaset Siyaset = (siyaset) EntryFactory.createEntry(siyaset.class);
            Siyaset.Sirala();
          

           bilim Bilim = (bilim) EntryFactory.createEntry(bilim.class);
            Bilim.Sirala();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}