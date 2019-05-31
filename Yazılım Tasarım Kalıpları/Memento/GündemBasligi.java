package designpattern6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ezgi
 */
public class GündemBasligi {

  private String  içerik;

  public String içerikAl() {
    return içerik;
  }

  public void içerikAta( final String içerik ) {
    this.içerik = içerik;
  }

  public GündemBasligiMomento momentoYarat() {
    return new GündemBasligiMomento( this );
  }

  public void momentoAta( final GündemBasligiMomento momento ) {
    this.içerik = momento.içerikAl();
  }
}

class GündemBasligiMomento {

  private final String  içerik;

  public GündemBasligiMomento( final GündemBasligi gundembasligi ) {
    this.içerik = gundembasligi.içerikAl();
  }

  public String içerikAl() {
    return içerik;
  }
}

class GündemBasligiYazımProgramı {

  private final GündemBasligi            gundembasligi;
  private final List< GündemBasligiMomento >  geçmişListesi  = new ArrayList< GündemBasligiMomento >();

  public GündemBasligiYazımProgramı( final GündemBasligi gundembasligi ) {
    this.gundembasligi = gundembasligi;
  }

  public void gundembasligiYaz( final String yeniİçerik ) {
    final GündemBasligiMomento momento = gundembasligi.momentoYarat();
    geçmişListesi.add( momento );

    gundembasligi.içerikAta( yeniİçerik );
  }

  public void geriAl() {
    final GündemBasligiMomento momento = geçmişListesi.remove( geçmişListesi.size() - 1 );
    gundembasligi.momentoAta( momento );
  }
}

class Üye {

  public static void main( final String[] args ) {
    final GündemBasligi gundembasligi = new GündemBasligi();
    gundembasligi.içerikAta( "" );

    final GündemBasligiYazımProgramı program = new GündemBasligiYazımProgramı( gundembasligi );
    program.gundembasligiYaz( "Siyaset" );
    program.gundembasligiYaz( "Edebiyat" );
    program.gundembasligiYaz( "Bilim" );
    program.gundembasligiYaz( "Spor" );

    // En son içerik "4" yazılır.
    // Fakat önceki içerikler saklanır.
    System.out.println( "En son içerik : " + gundembasligi.içerikAl() );

    // Son üç işlem geri alınır.
    program.geriAl();
    program.geriAl();
    program.geriAl();

    // Son üç işlem geri alındığı için, "1" içeriği yazılır.
    System.out.println( "Üç işlem geri alındıktan sonra içerik : " + gundembasligi.içerikAl() );
  }
}