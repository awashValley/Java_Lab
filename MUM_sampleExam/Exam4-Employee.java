
public class Employee {

	public String name;
	public String hireDate;
	public double salary;
	
	// constructor: like a method - except that they use the same name of the class and have no return type
	public Employee(String startName, String startHireDate, double startSalary){
		name = startName;
		hireDate = startHireDate;
		salary = startSalary;
	}
}
