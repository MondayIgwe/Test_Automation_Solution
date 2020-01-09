package java_Advanced;

import java.util.Vector;
import java.util.Enumeration;


public class EnumeratorTest {
	
 public static void main(String[] args) {
	Enumeration days;
	
	Vector dayNames = new Vector(); 
	dayNames.add("Sunday");
	dayNames.add("Monday");
	dayNames.add("Tuesday");
	dayNames.add("Wednesday");
	dayNames.add("Thursday");
	dayNames.add("Friday");
	dayNames.add("Saturday");
	
	int capacity = dayNames.capacity();
	System.out.println("The capacity can store "+ capacity);
	
	System.out.println();
	
	Object obj = dayNames.clone();
	System.out.println(obj);
	System.out.println();
	
	Object object = dayNames.get(2);
	System.out.println("Returning the element at the specified position in this vector "+object);
	 
	
	
	//store Vector Class inside Enumeration Class
	days = dayNames.elements();
	
	//Iterate
	while (days.hasMoreElements()) {
		System.out.println(String.valueOf(days.nextElement()));
	}
	
	
	
}
}
