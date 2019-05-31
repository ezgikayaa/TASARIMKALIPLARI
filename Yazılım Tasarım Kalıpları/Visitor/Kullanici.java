/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern6;

/**
 *
 * @author Ezgi
 */

interface Kullanici {

  void kabulEt( KullaniciVisitor visitor );
}

class Uye implements Kullanici {

  @Override
  public void kabulEt( KullaniciVisitor visitor ) {
   visitor.ziyaretEt( this );
  }
}

class Yönetici implements Kullanici{

  @Override
  public void kabulEt( KullaniciVisitor visitor ) {
    visitor.ziyaretEt( this );
  }
}
interface KullaniciVisitor {
    void ziyaretEt( Uye üye );

    void ziyaretEt( Yönetici yönetici );
}

class ProfilGoruntuleVisitor implements  KullaniciVisitor {

  @Override
  public void ziyaretEt(Uye üye ) {
    System.out.println( "Uye Profilini Görüntüledi." );
  }

  @Override
  public void ziyaretEt( Yönetici yönetici ) {
    System.out.println( "Yönetici Profilini Görüntüledi." );
  } 
}

class GirisVisitor  implements  KullaniciVisitor  {

  @Override
  public void ziyaretEt( final Uye üye ) {
    System.out.println( "Üye Giriş Yaptı" );
  }

  @Override
  public void ziyaretEt( final Yönetici yönetici ) {
    System.out.println( "Yönetici Giriş Yaptı." );
  }
}

class Sozlük{

   public static void main( final String[] args ) {

      // Personel nesnelerini oluştur.
      Uye üye = new Uye();
      Yönetici yönetici = new Yönetici();

      // Ziyaretçi nesnelerini oluştur.
       KullaniciVisitor ProfilGoruntuleVisitor = new  ProfilGoruntuleVisitor();
       KullaniciVisitor GirisVisitor  = new GirisVisitor ();

      //Profil Görüntüleme İşlemlerini Yap
      üye.kabulEt( ProfilGoruntuleVisitor );
      yönetici.kabulEt( ProfilGoruntuleVisitor );

      //Giriş İşlemlerini Yap
      üye.kabulEt( GirisVisitor );
      yönetici.kabulEt( GirisVisitor );
   }
}