package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int num1 = 20, num2 = 23, num3 = 2;
		int biggest = num1;

		if (biggest < num2) {
			biggest = num2;
		}
		if (biggest < num3) {
			biggest = num3;
		}

		System.out.println("En büyük sayı -> " + biggest);
	}
}
//9.video