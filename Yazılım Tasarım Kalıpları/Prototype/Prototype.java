package designpattern2;
import java.util.ArrayList;
import java.util.List;

public class Prototype {

	private List<String> LogListe;
        int numara=10;
       
	
	public Prototype(){
		LogListe = new ArrayList<>();
      
             
	}
	
	public Prototype(List<String> list){
		this.LogListe=list;
	}
	public void loadData(){
		
		LogListe.add("Giriş Yaptı");
		LogListe.add("Çıkış Yaptı");
		LogListe.add("Yorum Ekledi");
           
                
		
	}
     
	
	public List<String> getLogListe() {
		return LogListe;
	}
      
	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getLogListe()){
				temp.add(s);
			}
			return new Prototype(temp);
	}
	
}


class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype log = new Prototype();
                Prototype no = new Prototype();
	        no=log;
                log.numara=5;
                System.out.println(no.numara);
                System.out.println(log.numara);
               
              
		
                //Shallow Copy
                Prototype logNew = log;
		
		List<String> list = logNew.getLogListe();
		list.add("Gündem Başlığı Ekledi");
                System.out.println("Shallow Copy");
                System.out.println(log.getLogListe());
		System.out.println(logNew.getLogListe());
                
                System.out.println();
                
                System.out.println(log);
		System.out.println(logNew);
                 System.out.println();
                //Deep Copy
		Prototype logNew1 = (Prototype) log.clone();
             
                List<String> list1 = logNew1.getLogListe();
                list1.add("Yorum Sildi");
		
		System.out.println("Deep Copy");
                System.out.println(log.getLogListe());
                System.out.println(logNew1.getLogListe());
                
                System.out.println();
                
                System.out.println(log);
                System.out.println(logNew1);
                

	}

}