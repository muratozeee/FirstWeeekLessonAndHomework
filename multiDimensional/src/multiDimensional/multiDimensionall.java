package multiDimensional;

public class multiDimensionall {
	public static void main(String[] args) {
		
		
		
		String [] [] seh�rler = new String  [3][3];
		
		
		seh�rler[0][0]="�stanbul";
		seh�rler[0][1]="Bursa";
		seh�rler[0][2]="Bilecik";
		seh�rler[1][0]="Ankara";
		seh�rler[1][1]="Konya";
		seh�rler[1][2]="Kayseri";
		seh�rler[2][0]="Diyarbak�r";
		seh�rler[2][1]="Gaz�Anptep";
		seh�rler[2][2]="Sanl�urfa";
		
		for(int i=0;i<=2;i++) {
			
			System.out.println("--------------------");
			for(int j=0;j<=2;j++) {
				
				System.out.println(seh�rler[i][j]);
			}
		}
		
		
		
	}

}
