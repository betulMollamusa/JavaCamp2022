package mukemmelSayi;

//MiniProje3
public class Main {

	public static void main(String[] args) {
		int total=0,number=6;
		
		for(int i=1;i<number;i++) {
			if(number%i==0)
				total+=i;
		}
		if(total==number)
			System.out.println("girilen sayı mükemmeldir");
		else
			System.out.println("girilen sayı mükemmel değildir");

	}

}//21.Video