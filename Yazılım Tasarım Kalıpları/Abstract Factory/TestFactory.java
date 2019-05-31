/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern3;
import designpattern3.KullanicilarAbstractFactory;
import designpattern3.KullanicilarFactory;
import designpattern3.Kullanicilar;
/**
 *
 * @author Ezgi
 */
public class TestFactory {
    public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Kullanicilar üye = designpattern3.KullanicilarFactory.getKullanicilar(new UyeFactory("Ezgi Kaya","ezgikayaa24@gmail.com","freesoul"));
		Kullanicilar yönetici = designpattern3.KullanicilarFactory.getKullanicilar(new YoneticiFactory("Merver Tepe","mervetepe@gmail.com","gunes"));
		System.out.println("AbstractFactory Üye ::"+üye);
		System.out.println("AbstractFactory Yonetici ::"+yönetici);
	}
    
}
