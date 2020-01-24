package strings_Classes;

import java.util.Random;


public class StringClass {
	private static final int MAXIMUM_NUM = 3;
	
	StringClassData data = new StringClassData(new String[] {"sam","jane","ronny"}, new StringBuffer());

	public static void main(String[] args) {
		Object rObject = new StringClass().printStrings();
		System.out.println(rObject);

	}
	
	Object printStrings() {
		int test = 54;
		data.buffer.append(test);
		
		
		switch (test) {
			case 10: System.out.println("good");
			break;
			case 54 : System.out.println("Excellent");
			break;
		default:
				System.out.println("Invalid");
			break;
		}
		return test;
	}
	
	public void getForLoop() {
		Random random = new Random();
		int result = random.nextInt(data.firstName.length);
		String fistNameIndex = data.firstName[result];
		
		for(int i = 0;i<MAXIMUM_NUM;i++) {
	
		}
	}
	
  
}
