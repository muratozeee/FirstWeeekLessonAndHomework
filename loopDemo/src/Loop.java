import java.util.Iterator;

public class Loop {

	public static void main(String[] args) {
		
		
		for(int i=2;i<=10;i=i+2) {
			
			System.out.println("say�lar:"+i);
		}
		
		System.out.println("For Dongusu Bitti...");
		
		int i=0;
		
		//10 dan k���k oldu�u s�rece while d�ng�s� devam eder
		while(i<10) {
			
		System.out.println("Say�: "+i);
		
		i++;
		}
	System.out.println("While Dongusu Bitti...");
	
//do taki mant�k �art sa�lanmasa bile bir kere �al���r...
	i=0;
	do {
		
		System.out.println("Say� : "+i);
		i++;
	}
	while(i<=10);
	
	System.out.println("Do while Dongusu Bitti...");
	}
	
	

}
