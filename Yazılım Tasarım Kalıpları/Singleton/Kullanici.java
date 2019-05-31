
package designpattern;

public class Kullanici {

  
   

   public String k_adi;
   public String k_email;
   public String k_sifre;
   public String k_nick;
   public String k_cinsiyet;
   public int k_id;
   
 // Nesnemizin daha önceden oluşturulmadığını anlayabilmemiz için statik özelliği tanımlıyoruz.
   
   private static volatile Kullanici instance = null;
   //private static Object lock_obj=new Object();
   //construct(Kurucu) metodumuz
   private Kullanici(){}

  //Dışarıdan sınıfımızı çağıracağımız metodumuz.Singleton kalıbımızı oluşturduk.
   public static Kullanici getInstance(){
       
       
        if(instance == null)
        {
        
            instance  = new Kullanici();
        }
        
      return instance;
   }

   public void uyeprofilgoruntule(){
      System.out.println("Profil Görüntülendi");
   }
   
    public static void main(String[] args) {

      Kullanici object = Kullanici.getInstance(); 
      Kullanici object2 = Kullanici.getInstance(); 
      Kullanici object3 = Kullanici.getInstance(); 
       
      object.uyeprofilgoruntule();
      object2.uyeprofilgoruntule();
      object3.uyeprofilgoruntule();
     
   }
}
