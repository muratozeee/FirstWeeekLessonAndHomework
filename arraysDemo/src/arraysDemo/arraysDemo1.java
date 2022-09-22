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
		
		
		
		String [] ogrencýler = new String[4];
		

		ogrencýler[0]="Engin";
		ogrencýler[1]="Derin";
		ogrencýler[2]="Salih";
		ogrencýler[3]="Ahmet";
		
		for(int i=0;i<ogrencýler.length;i++) {
			
			System.out.println(ogrencýler[i]);
			 
		}
		
		
		//kýsa yolu stringle for kullannýmý
		System.out.println("--------------");
		
		
		for(String ogrencý:ogrencýler) {
	
			System.out.println(ogrencý);
			
			
		}
		
	}
}
