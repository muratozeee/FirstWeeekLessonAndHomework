
public class Mainn {

	public static void main(String[] args) {
		
		
		//En b�y�k say� bulma ve birbirine e�it say� varm�d�r varsa hangileri i� i�e if else d�ng�s� �rne�i  
		int say�1=70;
		int say�2=60;
		int say�3=60;
		
		if(say�1>=say�2 && say�1>say�3 ) {
			
		if(say�1==say�2) {
			System.out.println("Say�1 ve say�2 e�ittir ve en b�y�k say�= "+say�1);
			
		}
		else {
			System.out.println("En b�y�k Say�="+say�1);
		}
			
		}
		else if(say�2>say�1 && say�2>=say�3) {
			
			if(say�2==say�3) {
				System.out.println("Say�2 ve say�3 e�ittir ve en b�y�k say�= "+say�2);
				
			}
			else {
				System.out.println("En b�y�k Say�="+say�2);
			}
			
		}
		else if(say�3>=say�1 && say�3>say�2) {
			if(say�3==say�1) {
				System.out.println("Say�3 ve say�1 e�ittir ve en b�y�k say�= "+say�3);
				
			}
			else {
				System.out.println("En b�y�k Say�="+say�3);
			}
			
		}
		else {
			System.out.println("Butun Say�lar e�itir="+say�1);
			
		}
		
		
		}
			
		
		
		
		
	}

