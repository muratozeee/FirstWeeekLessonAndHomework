package stringDemo;

public class stringDemo1 {
	public static void main(String[] args) {
		
		
		String mesaj="   Bugün hava Cok Guzel.   ";
		
		System.out.println(mesaj);

		/*
		System.out.println("Harf Sayýsý: "+mesaj.length());
		//kaçýncý elemaný bulmak için
		
		System.out.println("5.elemanýn harfý: "+mesaj.charAt(4));
		//kelýme ekleme
		System.out.println(mesaj.concat(" Yaþasýn..."));
		//baþýnda ve sonunda kelime var mý yok  mu bulmak
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		
		//
		char[] karakterler= new char[5];
	
		mesaj.getChars(0, 5, karakterler, 0); //0 dan 5. sayýya kadar olan harfleri al ve karakterler charýna at ve 0 dan baþla
		
		System.out.println(karakterler);

		//çok kullanýlan kod
		
		//aradýgým harf kelimede kaçýncý harf yada yerini bulmak,ilk buldugu o harfý arar.
		
		System.out.println(mesaj.indexOf("a")); //soldan ilk a dýr...
		
		System.out.println(mesaj.lastIndexOf("a")); */ //saðdan ilk a dýr... 
		
		//sistemin yazýlanlarý deðiþtirme
		
		/*System.out.println((mesaj.replace("Bugün","yarýn")));*/
		
		/*System.out.println((mesaj.substring(2)));*/ //2.satýrdan itibaren ekrana yazar...
		
		
		/*System.out.println((mesaj.substring(6,10)));*/ //6.satýrdaki until 10 a kadar olan harfi yazar...
		
		
		//split ise kelimeleri ayýrmaya yarayan kodddu...
		
		
		/*for(String kelime : mesaj.split(" ")) {
			
			System.out.println(kelime);
			}*/
		
		
		System.out.println(mesaj.toLowerCase());
		
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim()); //boþluklarý silme
		
		
		
		
	}

}
