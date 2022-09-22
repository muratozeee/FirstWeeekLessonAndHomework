package multiDimensional;

public class multiDimensionall {
	public static void main(String[] args) {
		
		
		
		String [] [] sehırler = new String  [3][3];
		
		
		sehırler[0][0]="İstanbul";
		sehırler[0][1]="Bursa";
		sehırler[0][2]="Bilecik";
		sehırler[1][0]="Ankara";
		sehırler[1][1]="Konya";
		sehırler[1][2]="Kayseri";
		sehırler[2][0]="Diyarbakır";
		sehırler[2][1]="GazıAnptep";
		sehırler[2][2]="Sanlıurfa";
		
		for(int i=0;i<=2;i++) {
			
			System.out.println("--------------------");
			for(int j=0;j<=2;j++) {
				
				System.out.println(sehırler[i][j]);
			}
		}
		
		
		
	}

}
