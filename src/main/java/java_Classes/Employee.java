package java_Classes;

public class Employee {

	//Static varaible
	public static final String DEPARTMENT = "Test Automation Engineer";
	//instANCE VARIABLES
	String name;
	int age;
	String designation;
	double salary;
	
	
	//CONSTRUCTOR
	public Employee(String name) {
		this.name = name;
		
	}
	
	//Assign the age of the employee
	public void empAge(int empAge) {
		age = empAge;
		
	}
	
	public void empDesignate(String empDesination) {
		designation = empDesination;
	}
	
	public void empSalary(double empSalary) {
		salary = empSalary;
	}
	
	//Print the employee details
	public void printEmplyeeDetails() {
		System.out.println("The employee name is"+ " "+name.toUpperCase());
		System.out.println("The employee age is:"+" "+age);
		System.out.println("The employee designation"+ " "+  designation);
		System.out.println("The employee salary is"+" "+   salary);
	} 
}
