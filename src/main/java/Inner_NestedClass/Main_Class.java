package Inner_NestedClass;

import Interfaces.DemoInterface;

public class Main_Class {

	public static void main(String[] args) throws Exception{
		 
		NestedClasses outerClass = new NestedClasses();
		outerClass.print();
		outerClass.my_Method();
		
		new Main_Class().print_Interface();
		
}

	public int callInterface() throws Exception {
		DemoInterface d = null;
		return d.getScore(33);
	}
	
	
	public void print_Interface() throws Exception {
		Object cObject = callInterface();
		System.out.println(cObject);
	}
}
