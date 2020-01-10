package Inner_NestedClass;


public class NestedClasses {

	int num;
	
	//Inner Class
	private class Inner_Demo{
		
		public int getInt(int a) {
			int s = (num + a) + 2;
			return s;
		}
	}
	
	
	//Outer Class
	public void print() {
		Inner_Demo demo = new Inner_Demo();
		Object result = demo.getInt(1);	
		System.out.println(result);
		}

	
	//Inner Class Inside a method
	void my_Method() {
		int nu = 23;
		
		//METHOD LOCAL INNER CLASS
		class MethodInner_Demo{
			
			public void print() {
				System.out.println("This is the methos inner calss "+nu);
			}
			
		}//end of inner class
	}
	
	
	
}
