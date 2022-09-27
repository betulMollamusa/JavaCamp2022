
public class Main {
	public static void main(String[] args){
		Calculation calculation=new Calculation();
		int addResult=calculation.addition(3,4);
		int minusResult=calculation.extraction(8, 6);
		int multiResult=calculation.multiplication(5, 7);
		float divideResult=calculation.division(10, 4);
		System.out.println("toplama-> "+addResult+ "çıkarma->"+minusResult+"çarpma->"+multiResult+"bölme->"+divideResult);
	}

}
//30.Video