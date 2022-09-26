package stringsDemo;

public class Main {

	public static void main(String[] args) {
		char[] karakterler = new char[5];
		String mesaj = "   Bugün hava çok güzel";
		System.out.println(mesaj);

		System.out.println("Karakter sayısı =" + mesaj.length());//calculates the number of characters
		System.out.println("5. eleman -> " + mesaj.charAt(4));//Gets the 4th character
		System.out.println(mesaj.concat(" yaşasın!"));//Adder
		System.out.println(mesaj.startsWith("B"));//return true if the word starts with B or false if it is not starts with B
		System.out.println(mesaj.endsWith("l"));//return true if the word ends with l or false if it is not ends with l
		mesaj.getChars(0, 5, karakterler, 0);// gets the chars wich between 0-5 range
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));//search 'av' from left to right and returns its location
	System.out.println(mesaj.lastIndexOf("a"));//search 'a' from right to left and returns its location
		
		String yeniMesaj = mesaj.replace(' ', '-');//uses for replace between characters
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(6));//starts the sentence from the 6th character
		System.out.println(mesaj.substring(2,5));//Gets the 2nd to 5th character range
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);//Uses space character as separator character
		}
		
		System.out.println(mesaj.toLowerCase());//lowercase converter
		System.out.println(mesaj.toUpperCase());//uppercase converter
		System.out.println(mesaj.trim());//deletes leading space
		
	}

}
//17. and 18. Video