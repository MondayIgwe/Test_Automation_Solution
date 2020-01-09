package java_Classes;

public class Arrays {

	 String myArrays;
	 
	public Arrays() {
	 this.myArrays = "CAMRY";
	  System.out.println("THIS IS:==>"+myArrays);
		}
	public static void main(String[] args) {
		
		//First Pattern
		int[] num = new int[5];
		num[0] = 1000;
		num[1] = 2000;
		num[2] = 300;
		num[3] = 4000;
		num[4] = 56;
		
		
		System.out.println(num.length);
		System.out.println(num[2]);
	
		
		//second pattern
		int[] num1 = {1,2,3,4,5,6,7};
		System.out.println(num1.length+"  ==>" + "and array number 5 is: "+ num1[5]);
		
	
		int sNumber = num1.length;
		for(int i = 0; i<sNumber; i++) {
			System.out.println("==>"+ num1[i]);
		}
		//loop using break
		for (int i = 1; i<= 10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("=============Next===========");
		
		//Loop Continue condition
		for (int i = 1; i<= 10; i++) {
			if(i==5 ||i == 7) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("=============Next===========");
		//While loop
		int count = 5;
		
		while(count == 5) {
			count = count +  5;
			System.out.println(count);
		}
		
		System.out.println("=============Next===========");
		
		//Do loop
		int counter = 0;
		
		do {
			counter = counter + 1;
	
		}while(counter < 1);

		for(int items : num1) {
			
			System.out.println("This the one====>"+ items);
		}
		
		
	}

}
