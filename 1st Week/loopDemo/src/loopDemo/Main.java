package loopDemo;

public class Main {

	public static void main(String[] args) {
		System.out.println("FOR DÖNGÜSÜ İLE -----");
		//for Loop
		System.out.println("full numbers :");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("odd numbers :");
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("even numbers :");
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("WHİLE DÖNGÜSÜ İLE -----");
		int i=2;
		//While loop
		while(i<11) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("DO-WHİLE DÖNGÜSÜ İLE -----");
		int j=1;
		//do-While loop
		do{
			System.out.println(j);
			j+=2;
		}while(j<10) ;
	}

}
//11. , 12. , 13. Video