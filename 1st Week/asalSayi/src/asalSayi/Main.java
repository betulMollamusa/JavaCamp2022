package asalSayi;

//MiniProje1
public class Main {

	public static void main(String[] args) {
		int number = -5;
		boolean control = true;

		if (number < 1) {
			System.out.println("Geçersiz Sayı Girilmiştir");
			return;
		}
//		else if (number == 1)
//			System.out.println("girilen sayi asal değildir");
//		else {
		
		if(number==1) {
			System.out.println("girilen sayi asal değildir");
			return;
		}
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					control = false;
				}
			}
			if (control == true)
				System.out.println("girilen sayı asaldır");
			else
				System.out.println("girilen sayi asal değildir");
//		}
	}

}
//19.video