
public class Mainn {

	public static void main(String[] args) {
		
		
		//En büyük sayı bulma ve birbirine eşit sayı varmıdır varsa hangileri iç içe if else döngüsü örneği  
		int sayı1=70;
		int sayı2=60;
		int sayı3=60;
		
		if(sayı1>=sayı2 && sayı1>sayı3 ) {
			
		if(sayı1==sayı2) {
			System.out.println("Sayı1 ve sayı2 eşittir ve en büyük sayı= "+sayı1);
			
		}
		else {
			System.out.println("En büyük Sayı="+sayı1);
		}
			
		}
		else if(sayı2>sayı1 && sayı2>=sayı3) {
			
			if(sayı2==sayı3) {
				System.out.println("Sayı2 ve sayı3 eşittir ve en büyük sayı= "+sayı2);
				
			}
			else {
				System.out.println("En büyük Sayı="+sayı2);
			}
			
		}
		else if(sayı3>=sayı1 && sayı3>sayı2) {
			if(sayı3==sayı1) {
				System.out.println("Sayı3 ve sayı1 eşittir ve en büyük sayı= "+sayı3);
				
			}
			else {
				System.out.println("En büyük Sayı="+sayı3);
			}
			
		}
		else {
			System.out.println("Butun Sayılar eşitir="+sayı1);
			
		}
		
		
		}
			
		
		
		
		
	}

