/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern5;

import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void notify(String message);
}

interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}

class NoticeObservable implements Observable {

    private List<Observer> observerList = new ArrayList<>();
    private final String message = "Uyarı... !";

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer); // Kullanıcıları duyuruya eklemek için.
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer); // Kullanıcıları duyurudan silmek için.
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.notify(message); // Duyuru ya kayıtlı kullanıcılara mesaj göndermek için.
        }
    }

}

class Yorum implements Observer {

    private Observable observable;

    @Override
    public void notify(String message) {
        System.out.println(message + "Yorum Eklendi .");
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }

}

 class GundemBasligi implements Observer {

    private Observable observable;

    public GundemBasligi() {
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void notify(String message) {
        System.out.println(message + "Gündem Başlığı Eklendi.");
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }

}

class Observerr  {

     
    public static void main(String[] args) {
        
        Yorum yorum = new Yorum();
        GundemBasligi gundemBasligi = new GundemBasligi();

        NoticeObservable noticeObservable = new NoticeObservable();

        gundemBasligi.setObservable(noticeObservable);

        noticeObservable.addObserver(yorum);
        noticeObservable.addObserver(gundemBasligi);
        noticeObservable.notifyObserver();

        gundemBasligi.removeObserver();
        noticeObservable.notifyObserver();
    }
    
}