package inheritance;


public class SubClass extends SuperClass{

	
	public SubClass(double d, char c) {
		super(d, c);

	}

	public static void main(String[] args) {
		SubClass subClass = new SubClass(3.3,'A');
		subClass.my_Methods();
		((My_Interface) subClass).getPara();	
	}
	
	public void my_Methods(){
		SubClass sub = new SubClass(2.2,'S');
		
		while (sub instanceof SubClass) {
			super.display();
			sub.display();
			sub.getResult(200, 200);
			break;
		}
	
	}
	
	public void display(){
		System.out.println("This is the display method of subclass");
	}

}
