package arraysDemo;

public class Main {

	public static void main(String[] args) {
//		String student1="engin";
//		String student2="Derin";
//		String student3="Salih";
//		
//		System.out.println(student1);
//		System.out.println(student2);
//		System.out.println(student3);
		
		String[] students = new String[3];
		students[0]="engin";
		students[1]="Derin";
		students[2]="salih";
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		System.out.println("---------second for loop-------");
		for(String student : students) {
			System.out.println(student);
		}
	}

}
//14.Video