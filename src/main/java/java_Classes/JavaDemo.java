package java_Classes;


public class JavaDemo {

	//Dog Class
	int dogAge;
	String bread;
	String bark;
	String hunger;
	String sleep;
	
	
	
	//CONSTRUCTOR METHOD
	public JavaDemo (int num) {
		System.out.println("say number"+ num);
	}
	
	//default method
	void barking(String sBark) {
		bark = sBark;
		System.out.println("This Dog will bark");
	
	}
	
	public void setAge(int age) {
		
		dogAge = age;
		
	}
	
	public int getAge() {
		
		return dogAge;
	}
	
	public void price() {
		int code = 2 ;
		code = code * 100;
		System.out.println("The price is:"+ code);
	}
	
	public String hungry(String food) {
		hunger = food;
		System.out.println("This Dog will eat"+  ""+  hunger);
		return food;
	}
	
	
	void sleeping() {
		System.out.println("The dog will sleep");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//create a constructor
		JavaDemo demo = new JavaDemo(122);
		demo.sleeping();
		demo.hungry("rice");
		demo.setAge(488);
		demo.price();
		System.out.println("The dog is:"+ demo.getAge());
		
	}

}
