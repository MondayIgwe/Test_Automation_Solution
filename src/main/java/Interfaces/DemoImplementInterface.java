package Interfaces;

/*
 * Implementing an interface 
 */


public class DemoImplementInterface implements DemoInterface, MultipleInterfaces_3{
	
	 int score;
	 String username;
	 int password;
	 String booking;
	 
 
 
 //CONSTRUCTOR
  	public DemoImplementInterface(String user, int pass) {
  		this.username=user;
  		this.password=pass;
  	}
 
	 public static void main(String[] args) {
		 DemoImplementInterface  demo = new DemoImplementInterface("Mon!@#48484", 3938939);
		 int result = demo.getScore(300);
		 System.out.println(result);
		 String travellingString = demo.travel("Flight By Air");
		 System.out.println(travellingString);
	}
	 
	 
	 
	@Override
	public void eat() {
	
		
	}


	@Override
	public int getScore() {
		
		return 0;
	}

	@Override
	public int getScore(int score) {
		return this.score=score;
	}

	@Override
	public String travel(String bookings) {
		return this.booking=bookings;
		
		
	}

	@Override
	public Integer figures() {
		
		return null;
	}



}
