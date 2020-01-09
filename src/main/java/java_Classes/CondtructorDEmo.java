package java_Classes;

public class CondtructorDEmo {


	static int a = 5;
	static boolean sValue;
	static String name = "http";
	static String name1 = "http";
	static int num = 100;
	
	//CONSTRUCTOR LIKE A METHOD
	public CondtructorDEmo(String name) {
		System.out.println("This is a constructor"+ name);
	}
	
	public static void main(String[] args) {
		CondtructorDEmo java = new CondtructorDEmo("monday");
		
		JavaDemo anotherClass = new JavaDemo(234);
		
		
		for(int i =0; i<a; a++) {
			if(a == 7)
				break;
			System.out.println(a);
		}
		
		
	
		sValue = (name==name1)? true:false;
		System.out.println(sValue);
		
		
		if(num==100) {
		  System.out.println(num);
		}else if(num == 10) {
			System.out.println("You are wrong");
		}else {
			System.out.println("Unknown number");
		}
		
		System.out.println(java.getClass());
	}

}
