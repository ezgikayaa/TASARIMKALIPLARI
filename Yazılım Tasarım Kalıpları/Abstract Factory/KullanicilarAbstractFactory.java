/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern3;
import designpattern3.Kullanicilar;

public interface KullanicilarAbstractFactory {
    public  Kullanicilar createKullanicilar();
}
   class UyeFactory implements KullanicilarAbstractFactory {
        
       private String adi;
       private String email;
       private String nick;
	
	public UyeFactory(String adi, String email, String nick){
		this.adi=adi;
                this.email=nick;
                this.nick=nick;
	}
	@Override
	public  Kullanicilar createKullanicilar() {
		return new Uye(adi,email,nick);
	}

    

}
 class YoneticiFactory implements KullanicilarAbstractFactory {
        
       private String adi;
       private String email;
       private String nick;
	
	public YoneticiFactory(String adi, String email, String nick){
		this.adi=adi;
                this.email=nick;
                this.nick=nick;
	}
	@Override
	public  Kullanicilar createKullanicilar() {
		return new Yonetici(adi,email,nick);
	}

   

    

}
    

