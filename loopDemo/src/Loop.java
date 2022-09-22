import java.util.Iterator;

public class Loop {

	public static void main(String[] args) {
		
		
		for(int i=2;i<=10;i=i+2) {
			
			System.out.println("sayýlar:"+i);
		}
		
		System.out.println("For Dongusu Bitti...");
		
		int i=0;
		
		//10 dan küçük olduðu sürece while döngüsü devam eder
		while(i<10) {
			
		System.out.println("Sayý: "+i);
		
		i++;
		}
	System.out.println("While Dongusu Bitti...");
	
//do taki mantýk Þart saðlanmasa bile bir kere çalýþýr...
	i=0;
	do {
		
		System.out.println("Sayý : "+i);
		i++;
	}
	while(i<=10);
	
	System.out.println("Do while Dongusu Bitti...");
	}
	
	

}
