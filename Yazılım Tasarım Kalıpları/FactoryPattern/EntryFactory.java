
package designpattern;

 //ComputerFactory sınıfının bir tane static metodu var bu yordam diğer sınıfları oluştururken her seferinde tekrar tekrar oluşturmak yerine statik bir biçimde daha optimize olarak oluşturmaktadır.
public class EntryFactory {
      public static EntryKategorisi createEntry(Class aClass) throws IllegalAccessException, InstantiationException {
        
            return (EntryKategorisi) aClass.newInstance();
    }
    
}
