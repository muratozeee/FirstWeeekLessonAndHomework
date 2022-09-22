package miniProjectAsalSayý;

public class miniProjectAsalSayýVideo {
	

	public static void main(String[] args) {
		
		int number=-5;
		
		if(number<2) {
			System.out.println("Geçersiz Sayý");
			return;
		}
		boolean isPrime=true;
		
			for(int i=2; i<number;i++) {
				
				if(number%i==0) {
					
					isPrime=false;
					
					
				}
				
			}
			
			if(isPrime) {
				
				System.out.println("Asal Sayýdýr");
			}
			else {
				System.out.println("Asal Sayý Deðildir...");
			}

	}
}
