package stringDemo;

public class stringDemo1 {
	public static void main(String[] args) {
		
		
		String mesaj="   Bug�n hava Cok Guzel.   ";
		
		System.out.println(mesaj);

		/*
		System.out.println("Harf Say�s�: "+mesaj.length());
		//ka��nc� eleman� bulmak i�in
		
		System.out.println("5.eleman�n harf�: "+mesaj.charAt(4));
		//kel�me ekleme
		System.out.println(mesaj.concat(" Ya�as�n..."));
		//ba��nda ve sonunda kelime var m� yok  mu bulmak
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		
		//
		char[] karakterler= new char[5];
	
		mesaj.getChars(0, 5, karakterler, 0); //0 dan 5. say�ya kadar olan harfleri al ve karakterler char�na at ve 0 dan ba�la
		
		System.out.println(karakterler);

		//�ok kullan�lan kod
		
		//arad�g�m harf kelimede ka��nc� harf yada yerini bulmak,ilk buldugu o harf� arar.
		
		System.out.println(mesaj.indexOf("a")); //soldan ilk a d�r...
		
		System.out.println(mesaj.lastIndexOf("a")); */ //sa�dan ilk a d�r... 
		
		//sistemin yaz�lanlar� de�i�tirme
		
		/*System.out.println((mesaj.replace("Bug�n","yar�n")));*/
		
		/*System.out.println((mesaj.substring(2)));*/ //2.sat�rdan itibaren ekrana yazar...
		
		
		/*System.out.println((mesaj.substring(6,10)));*/ //6.sat�rdaki until 10 a kadar olan harfi yazar...
		
		
		//split ise kelimeleri ay�rmaya yarayan kodddu...
		
		
		/*for(String kelime : mesaj.split(" ")) {
			
			System.out.println(kelime);
			}*/
		
		
		System.out.println(mesaj.toLowerCase());
		
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim()); //bo�luklar� silme
		
		
		
		
	}

}
