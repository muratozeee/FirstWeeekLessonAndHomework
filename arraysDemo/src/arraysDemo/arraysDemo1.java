package arraysDemo;

public class arraysDemo1 {

	public static void main(String[] args) {
		
		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		String ogrenci4="Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		System.out.println("--------------------	");
		//stringleri Array ile kullanma
		
		
		
		String [] ogrenc�ler = new String[4];
		

		ogrenc�ler[0]="Engin";
		ogrenc�ler[1]="Derin";
		ogrenc�ler[2]="Salih";
		ogrenc�ler[3]="Ahmet";
		
		for(int i=0;i<ogrenc�ler.length;i++) {
			
			System.out.println(ogrenc�ler[i]);
			 
		}
		
		
		//k�sa yolu stringle for kullann�m�
		System.out.println("--------------");
		
		
		for(String ogrenc�:ogrenc�ler) {
	
			System.out.println(ogrenc�);
			
			
		}
		
	}
}
