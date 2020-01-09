package java_Advanced;

import java.awt.Checkbox;
import java.io.StreamCorruptedException;
import java.util.Enumeration;

public class Vector {

	public static void main(String[] args) {
		java.util.Vector v = new java.util.Vector(3, 2);
		System.out.println("Initial size "+ v.size());
		

		v.addElement(new Integer(1));
		v.addElement(new Double(5.5));
		v.addElement(new Float(8.09));
		System.out.println("The First Element is: "+(Integer)v.firstElement());
		System.out.println("The last Element is: "+(Float)v.lastElement());
 		System.out.println("Initial capacity "+ v.capacity());
 		
 		boolean assertS = v.contains(new Integer(3));
 		if(assertS);
 		Enumeration vEnum = v.elements();
 		
 		while (vEnum.hasMoreElements()) {
			System.out.println(vEnum.nextElement());
			
		}
	}
}
