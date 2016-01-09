
/*	------------------------------	*/
/*	MUM: Exam for Preparatory Work	*/
/*	------------------------------	*/

// LINK: http://mscs.mum.edu/preparatory-track-sample-exam.html

/*
4. 4. [Tests for a minimal knowledge of OO] Create a class Employee, having attributes

String name

Date hireDate

double salary

The constructor should accept values for all three of these attributes and set them.
Then create a Test class having a main method in which the following is done:

a. An array of Employee instances is created, with the following data:

[“Bob”, “11/01/2000”, 45000.00]

[“Dave”, “10/01/1990”, 65000.00]

[“Hal”, “01/01/1995”, 55000.00]

[“Susan”, “08/20/2004”, 45000.00]

b. In a separate loop, the salaries of the employees in this array are summed, and the total is printed to the console.
*/

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Bob", "11/01/2000", 45000.00);
		Employee emp2 = new Employee("Dave", "10/01/1990", 65000.00);
		Employee emp3 = new Employee("Hal", "01/01/1995", 55000.00);
		Employee emp4 = new Employee("Susan", "08/20/2004", 45000.00);
		
		
		
		
		
	}

}
