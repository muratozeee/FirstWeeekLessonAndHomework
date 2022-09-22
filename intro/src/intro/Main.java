package intro;

import java.text.StringCharacterIterator;

public class Main {

	public static void main(String[] args) {
	System.out.println("Hell world!");//ctrl+space push on the key  and we can see the complete codes and we can select it 

	//javada isimlendirmeler camelCase sekilde yazýlýr...
	String ortaMetin="Ýlginizi çekebilir";
	String altMetin="Vade süresi";
	
	System.out.println(ortaMetin);
	
	int vade=12;
	
	double dolarDun=18.20;
	double dolarBugun=18.25;
	
	boolean dolarDustuMu =false;
	
	String okYonu = "";
	
	if (dolarBugun<dolarDun) {
	
		okYonu="down.svg";
		
		System.out.println(okYonu);
		
	} else if(dolarBugun>dolarDun) {
		
		okYonu="up.svg";
		
		System.out.println(okYonu);
		
	}
	
	else {
		
		okYonu="equal.svg";
		System.out.println(okYonu);
		

	}
	
	
	//array
	
	String[] krediler= {"Hýzlý Kredi","Maaþýný Halkbankdan Al","Mutlu Emekli"};
	
	
	
	for (int i = 0; i < krediler.length; i++) {
		
		System.out.println(krediler[i]);
		
		
		
		
		//Youtube exams
		
		System.out.println("Merhaba Java");
		System.out.println("Merhaba Java2");
		
		//Variables
		//case sensitive
		//camel casing=her kelime baþýna büyük harf anlamý
		
		int  OgrencýSayýsý= 12;
		
		String mesaj="Ogrenci Sayýsý: " ;
		
		System.out.println(mesaj + OgrencýSayýsý); //how to using string type
		System.out.println(mesaj + OgrencýSayýsý);
		System.out.println("Ogrencý Sayým : "+ OgrencýSayýsý);
		System.out.println("Ogrencý Sayým : "+ OgrencýSayýsý);
		
		
		
		//Primitive Type-temel veri tipleri
		
		double sayý=12.5;
		System.out.println(sayý);
		
		//char is charatrize
		
		char karakter ='A';
		
		//boolen=true or false like using 1 or 0
		
		boolean dogruMu=false ;
		
		
		//conditionals
		
		int sayi=20;
		if(sayi<20) {
			
			System.out.println("Sayý 20 den Kucuktur...");
			
			
		}else if(sayi>20) {
			
			System.out.println("Sayý 20 den Büyüktür");
			
		}else {
			
			System.out.println("Sayý 20 ye Eþittir...");
			
		}
		
		
		
		
		
				
	}

	}

	
	
}
