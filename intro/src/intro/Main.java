package intro;

import java.text.StringCharacterIterator;

public class Main {

	public static void main(String[] args) {
	System.out.println("Hell world!");//ctrl+space push on the key  and we can see the complete codes and we can select it 

	//javada isimlendirmeler camelCase sekilde yaz�l�r...
	String ortaMetin="�lginizi �ekebilir";
	String altMetin="Vade s�resi";
	
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
	
	String[] krediler= {"H�zl� Kredi","Maa��n� Halkbankdan Al","Mutlu Emekli"};
	
	
	
	for (int i = 0; i < krediler.length; i++) {
		
		System.out.println(krediler[i]);
		
		
		
		
		//Youtube exams
		
		System.out.println("Merhaba Java");
		System.out.println("Merhaba Java2");
		
		//Variables
		//case sensitive
		//camel casing=her kelime ba��na b�y�k harf anlam�
		
		int  Ogrenc�Say�s�= 12;
		
		String mesaj="Ogrenci Say�s�: " ;
		
		System.out.println(mesaj + Ogrenc�Say�s�); //how to using string type
		System.out.println(mesaj + Ogrenc�Say�s�);
		System.out.println("Ogrenc� Say�m : "+ Ogrenc�Say�s�);
		System.out.println("Ogrenc� Say�m : "+ Ogrenc�Say�s�);
		
		
		
		//Primitive Type-temel veri tipleri
		
		double say�=12.5;
		System.out.println(say�);
		
		//char is charatrize
		
		char karakter ='A';
		
		//boolen=true or false like using 1 or 0
		
		boolean dogruMu=false ;
		
		
		//conditionals
		
		int sayi=20;
		if(sayi<20) {
			
			System.out.println("Say� 20 den Kucuktur...");
			
			
		}else if(sayi>20) {
			
			System.out.println("Say� 20 den B�y�kt�r");
			
		}else {
			
			System.out.println("Say� 20 ye E�ittir...");
			
		}
		
		
		
		
		
				
	}

	}

	
	
}
