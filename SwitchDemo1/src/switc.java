
public class switc {
	

	public static void main(String[] args) {
		
		
		char grade = 'F';
		
		switch(grade) {
		
		case 'A':
			System.out.println("M�kemmel:Ge�tiniz...");
			break;
			
		case 'B':
			
			System.out.println("�ok iyi:Ge�tiniz...");
			break;
			
		case 'C':
			
			System.out.println("iyi:Ge�tiniz...");
			break;
			
			
		case 'D':
			
			System.out.println("Orta:Ge�tiniz...");
			break;
			
			
		case 'F':
			
			System.out.println("K�t�:Kald�n�z...");
			break;
		
			default:
				System.out.println("Ge�ersiniz Kod");
			
		}
	}
}
