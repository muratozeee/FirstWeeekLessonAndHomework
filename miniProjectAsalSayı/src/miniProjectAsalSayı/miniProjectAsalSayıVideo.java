package miniProjectAsalSay�;

public class miniProjectAsalSay�Video {
	

	public static void main(String[] args) {
		
		int number=-5;
		
		if(number<2) {
			System.out.println("Ge�ersiz Say�");
			return;
		}
		boolean isPrime=true;
		
			for(int i=2; i<number;i++) {
				
				if(number%i==0) {
					
					isPrime=false;
					
					
				}
				
			}
			
			if(isPrime) {
				
				System.out.println("Asal Say�d�r");
			}
			else {
				System.out.println("Asal Say� De�ildir...");
			}

	}
}
