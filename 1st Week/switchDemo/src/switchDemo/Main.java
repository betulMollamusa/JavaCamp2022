package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade='B';
		switch(grade) {
		case 'A':
			System.out.println("Harika, geçmişsiniz :)");
			break;
		case 'B':
			System.out.println("Güzel, geçmişsiniz :)");
			break;
		case 'C':
			System.out.println("iyi, geçmişsiniz :)");
			break;
		case 'D':
			System.out.println("Fena değil, geçmişsiniz :)");
			break;
		case 'F':
			System.out.println("maalesef, geçmemeişsiniz :)");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

	}

}
//10.Video