package Inner_NestedClass;

import org.omg.CORBA.PRIVATE_MEMBER;

import Interfaces.DemoInterface;

public class Main_Class {

	public static void main(String[] args) throws Exception{
		 
		 NestedClasses outerClass = new NestedClasses();
		outerClass.print();
		outerClass.my_Method();
		
		new Main_Class().print_Interface();
		
}
	

	public void callInterface() throws Exception {
				
				System.out.println(DemoInterface.getScore(265));
	}
	
	
	public void print_Interface() throws Exception {
		callInterface();
	}
}
