/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern7;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ezgi
 */
public interface Kullanıcı {
      void bilgiYazdır();
}
class Üye implements Kullanıcı {

  private  String  isim;
  private  String  nick;

  public Üye(String isim, String nick ) {
    this.isim = isim;
    this. nick=  nick;
  }

  @Override
  public void bilgiYazdır() {
    System.out.println( "İsim: " + isim + ", Nick: " + nick );
  }
}

class Yönetici implements Kullanıcı{

  private final List< Kullanıcı >  Üyeler  = new ArrayList< Kullanıcı >();

  @Override
  public void bilgiYazdır() {
    for ( final Kullanıcı Üye : Üyeler ) {
      Üye.bilgiYazdır();
    }
  }

  public void ÜyeEkle( Kullanıcı kullanıcı ) {
    Üyeler.add( kullanıcı );
  }

  public void ÜyeÇıkar( Kullanıcı kullanıcı  ) {
    Üyeler.remove( kullanıcı  );
  }
}

class Sözlük {

  public static void main( final String[] args ) {

    // Örnek bir hiyerarşi yaratılıyor.
    Üye Üye1 = new Üye( "Ezgi Kaya", "freesoul" );
    Üye Üye2 = new Üye( "Ali Sever", "köse25" );
    Üye Üye3 = new Üye( "Merve Tepe", "günes_" );
    Üye Üye4 = new Üye( "Derya Diken", "papatya" );
    Üye Üye5 = new Üye( "Kamil Ertek", "45_kereste" );

    Yönetici yönetici1 = new Yönetici();
    Yönetici yönetici2 = new Yönetici();
    Yönetici başYönetici = new Yönetici();
    

    yönetici1.ÜyeEkle( Üye1 );
    yönetici1.ÜyeEkle( Üye4 );
    yönetici1.ÜyeEkle( Üye5 );
   
    yönetici2.ÜyeEkle( Üye2 );
    yönetici2.ÜyeEkle( Üye3 );

    başYönetici.ÜyeEkle( yönetici1 );
    başYönetici.ÜyeEkle( yönetici2 );

    // Ağaç yapısı üzerinde dolaşarak,
    // tüm işçilerin bilgileri yazılır.
    
    başYönetici.bilgiYazdır();
  }
}