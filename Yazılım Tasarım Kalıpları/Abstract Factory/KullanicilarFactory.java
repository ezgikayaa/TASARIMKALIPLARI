/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern3;
import designpattern3.Kullanicilar;
import designpattern3.KullanicilarAbstractFactory;
/**
 *
 * @author Ezgi
 */
public class KullanicilarFactory {
    public static Kullanicilar getKullanicilar(KullanicilarAbstractFactory factory){
		return factory.createKullanicilar();
	}
    
}
