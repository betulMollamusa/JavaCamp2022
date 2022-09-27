package methods2;

public class Main {

	public static void main(String[] args) {
		String message="Bugün hava çok güzel";
		String newMessage=returnCity();
		int sum=addUp(5,7);
		int result=addUp2(1,2,3);
		System.out.println(newMessage);
		System.out.println(sum);
		System.out.println(result);
	}

	public static void add() {
		System.out.println("Eklendi");
	}

	public static void delete() {
		System.out.println("silindi");
	}

	public static void update() {
		System.out.println("güncellendi");
	}
	
	public static int addUp(int a,int b) {
		return (a+b);
	}
	
	public static int addUp2(int...numbers) {
		int total=0;
		for(int number:numbers) {
			total+=number;
		}
		return total;
	}
	
	public static String returnCity() {
		return ("Anakara");	}
}
//25. , 26. Video
