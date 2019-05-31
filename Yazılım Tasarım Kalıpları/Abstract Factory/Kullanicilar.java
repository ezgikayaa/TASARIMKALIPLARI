/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern3;

public abstract class Kullanicilar {  
    public abstract String getAdi();
    public abstract String getEmail();
    public abstract String getNick();
     
    @Override
    public String toString(){
        return "Adi= "+this.getAdi()+", Email="+this.getEmail()+", Nick="+this.getNick();
    }
}
 class Uye extends Kullanicilar {
 
    private String adi;
    private String email;
    private String nick;
     
    public Uye(String adi, String email, String nick){
        this.adi=adi;
        this.email=nick;
        this.nick=nick;
    }
    @Override
    public String getAdi() {
        return this.adi;
    }
 
    @Override
    public String getEmail() {
        return this.email;
    }
 
    @Override
    public String getNick() {
        return this.nick;
    }
 
 
}
 class Yonetici extends Kullanicilar{

    private String adi;
    private String email;
    private String nick;
     
    public Yonetici(String adi, String email, String nick){
        this.adi=adi;
        this.email=nick;
        this.nick=nick;
    }
    @Override
    public String getAdi() {
        return this.adi;
    }
 
    @Override
    public String getEmail() {
        return this.email;
    }
 
    @Override
    public String getNick() {
        return this.nick;
    }
    }

