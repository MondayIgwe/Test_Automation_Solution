package java_Classes;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("Monday");
		Employee employee1 = new Employee("IGWE");
		
	employee.empAge(10);
	employee.empDesignate("Johannesburg");
	employee.empSalary(3000);
	
	employee1.empAge(133);
	employee1.empDesignate("Durban");
	employee1.empSalary(5000);

	
	//objectReference.VariableName
	System.out.println("I am a " + " "+Employee.DEPARTMENT);
	
	
	//call print method
	employee.printEmplyeeDetails();
	employee1.printEmplyeeDetails();
	

	}

}
