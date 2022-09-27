package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
	}
	
	public static void findNumber(){
		int[] numbers={1,2,3,4,5};
		int number=5;
		boolean control=false;
		
		for(int count:numbers) {
			if(count==number) {
				control=true;
				break;
			}
		}
		message(control,number);
	}
	
	public static void message(boolean available,int num) {
		if(available==true)
			System.out.println("aranan sayı bulunmuştur --> "+num);
		else
			System.out.println("aranan sayı bulunamadı --> "+num);	
	}

}
//24.Video
