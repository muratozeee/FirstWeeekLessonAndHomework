package m�kemmelSay�;

public class m�kemmelSay� {

	public static void main(String[] args) {
		
		int number=27;
		int toplam=0;
		for(int i=1;i<number;i++) {
			
			if(number%i==0) {
			toplam=toplam+i;
			}
			
			
		}
		
		if(toplam==number) {
			System.out.println("M�kemmel say�d�r");
		}else
		{
			System.out.println("M�kemmel Say� de�ildir");
		}
	}
}
