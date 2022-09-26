package sesliHarfler;

//MiniProje2
public class Main {

	public static void main(String[] args) {
		char letter='Ü';
		
		switch(letter) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("Kalın sesli harf girilmiştir");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
		case 'e':
		case 'i':
		case 'ü':
		case 'ö':
			System.out.println("ince sesli harf girilmiştir");
			break;
		default:
			System.out.println("geçersiz harf girilmiştir");
		}
	}

}
//20.Video