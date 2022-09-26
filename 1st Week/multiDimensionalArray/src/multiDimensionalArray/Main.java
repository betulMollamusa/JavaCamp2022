package multiDimensionalArray;

public class Main {

	public static void main(String[] args) {
		String[][] cities = new String[3][3]; 
		
		cities[0][0]="İstanbul";
		cities[0][1]="Ankara";
		cities[0][2]="Bursa";
		cities[1][0]="Kayseri";
		cities[1][1]="İzmir";
		cities[1][2]="Antalya";
		cities[2][0]="Diyarbakır";
		cities[2][1]="Trabzon";
		cities[2][2]="Edirne";
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println(cities[i][j]);
			}
		}
	}

}
//16.Video