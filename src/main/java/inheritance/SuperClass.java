package inheritance;

public class SuperClass implements My_Interface {
	
	int z;

	double d;
	char c;
	
	
	//Constructor
	public SuperClass(double d, char c) {
		this.d=d;
		this.c=c;
	}
	public Integer addition(final int x, final int y) {
		return z = x+y;
		
	}
	
	
	public void getResult(final int x, final int y) {
		  int s = addition(x, y);
		  System.out.println("The Sum of the two numbers is:"+ s);
	}
	
	public String[] getArray() {
		return myArray;
		
	}
	
	public void display(){
		System.out.println("This is the display method of superclass");
		}
	
	@Override
	public void name() {
		
		
	}

}
