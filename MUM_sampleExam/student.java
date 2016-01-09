

import java.util.Scanner;

public class student {
	
	private int admno;
	private String sname;
	private float eng, math, science;
	private float total;
	
	private float ctotal(){
		total = eng + math + science;
		return total;
	}
	
	public void takeData(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student data: ");
		
		admno = input.nextInt();
		sname = input.nextLine();
		eng = input.nextFloat();
		math = input.nextFloat();
		science = input.nextFloat();
		
		System.out.println("The student scored " + ctotal() + ".");
		
	}
	
	public void showData(){
		
		System.out.println("Admision Number: " + admno);
		System.out.println("Student Name: " + sname);
		System.out.println("English: " + eng);
		System.out.println("Mathematics: " + math);
		System.out.println("Science: " + science);
		System.out.println("Total: " + total);
	}

	
	public static void main(String[] args) {
		
		student std1 = new student();
		
		std1.takeData();
		std1.showData();
	}

}
