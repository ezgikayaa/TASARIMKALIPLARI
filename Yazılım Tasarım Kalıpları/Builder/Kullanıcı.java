/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern3;

public class Kullanıcı {

    private final String adi;
    private final String email;
    private final String telefonNo;
    private final int id;
    private final String nick;
    private final String cinsiyet;
  

    public Kullanıcı(KullanıcıBuilder kullanıcıBuilder) {
        this.adi = kullanıcıBuilder.adi;
        this.email = kullanıcıBuilder.email;
        this.telefonNo = kullanıcıBuilder.telefonNo;
        this.nick= kullanıcıBuilder.nick;
        this.cinsiyet= kullanıcıBuilder.cinsiyet;
        this.id= kullanıcıBuilder.id;
    }

    public String getAdi() {
        return adi;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public String getNick() {
        return nick;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }
    
      public int getİd() {
        return id;
    }
      
    @Override
    public String toString() {
        return "Kullanıcı: " + this.adi+ ", " + this.nick+ ", " + this.email + ", " + this.telefonNo + ", " + this.cinsiyet;
    }

    public static class KullanıcıBuilder {
        private String adi;
        private String email;
        private String telefonNo;
        private String nick;
        private String cinsiyet;
        private int id;

        public KullanıcıBuilder(String adi, String nick) {
            this.adi = adi;
            this.nick= nick;
        }

        public KullanıcıBuilder id(int id) {
            this.id = id;
            return this;
        }

        public KullanıcıBuilder telefonNo(String telefonNo) {
            this.telefonNo= telefonNo;
            return this;
        }

        public KullanıcıBuilder email(String email) {
            this.email = email;
            return this;
        }
        
           public KullanıcıBuilder cinsiyet(String cinsiyet) {
            this.cinsiyet = cinsiyet;
            return this;
        }

        public Kullanıcı build() {
            Kullanıcı kullanıcı = new Kullanıcı(this);
            return kullanıcı;
        }
    }
  
    public static void main(String[] args) {
        Kullanıcı ezgi = new Kullanıcı.KullanıcıBuilder("Ezgi Kaya", "freesoul")
                .email("ezgikaya9624@gmail.com")
                .telefonNo("+90 216 504 5655")
                .cinsiyet("Kadın")
                .build();

        Kullanıcı ali = new Kullanıcı.KullanıcıBuilder("Ali Sever", "köse")
                .email("alisever@gmail.com")
                .telefonNo("+90 216 504 5655")
                .build();

        Kullanıcı merve = new Kullanıcı.KullanıcıBuilder("Merve Tepe", "günes")
                .telefonNo("+90 216 524 1245")
                .build();

        System.out.println(ezgi);
        System.out.println(ali);
        System.out.println(merve);
    }
}

