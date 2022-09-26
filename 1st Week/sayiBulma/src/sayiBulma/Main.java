package sayiBulma;

//MiniProje5
public class Main {

	public static void main(String[] args) {
		int[] number={1,2,3,4,5};
		int soughtValue=5;
		boolean var=false;
		
		for(int sayi:number) {
			if(sayi==soughtValue) {
				var=true;
				break;
			}
		}
		if(var==true)
			System.out.println("aranan sayı bulunmuştur");
		else
			System.out.println("aranan sayı bulunamadı");
	}

}
//23.Video