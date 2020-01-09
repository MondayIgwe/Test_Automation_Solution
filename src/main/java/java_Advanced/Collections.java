package java_Advanced;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.midi.MidiChannel;


public class Collections {

	public static void main(String[] args) {
		
		//LIST INTERFACE
		Collection c = new LinkedList<>();
		c.add("moonLight");
	
		List a1 = new ArrayList(c);
		a1.add(new String("Zara"));
		a1.add(new Integer(1));
		a1.add(2, new Double(4.5));
		
		ListIterator itrI = a1.listIterator();
		
		while (itrI.hasNext()) {
			Object elementObject = itrI.next();
			System.out.println(elementObject);
					}
		System.out.println("Get the first index "+a1.get(0));
		System.out.println("After resetting an object "+ a1.set(2,new String("moon")));
		System.out.println("Removes the element at position index from the "
				+ "invoking list and returns the deleted element: "+a1.remove(2));
		
		System.out.println();
		
		List a2 = new LinkedList();
		a2.add("fees");
		a2.add("School");
		
		Object[] str = a2.toArray();
		System.out.println(a2+" \n"+"The Array is "+str.length);
		
		System.out.println();
		
		
		//SET INTERFACE
		Set s1 = new HashSet(c);
		s1.add(new String("boo"));
		s1.add("lag");	
		
		if (!s1.isEmpty() && s1.contains("lag")) {
			System.out.println("The size is "+s1.size());
		}
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element);
		}
	
		System.out.println();
		
		int[] count = {34,54,67,89,90};
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<5;i++) {
			set.add(count[i]);
		}
		System.out.println(set);
		
		System.out.println();
		
		//TREESET interface and TREESET CLASS
		TreeSet sortedSet = new TreeSet<Integer>(set);
		System.out.println("The sorted list are: ");
		System.out.println(sortedSet);
		System.out.println(sortedSet.first());
		System.out.println(sortedSet.comparator());
		
		System.out.println();
		
		
		//MAP INTERFACE and HASHMAP Class
		Map m1 = new HashMap();
		m1.put("code", 100);
		
		m1.put("Daisy", new Double(99.22));
		System.out.println(m1);
		
		System.out.println();
		
		Set set2 = m1.entrySet();
		Iterator itr2 = set2.iterator();
		
		while (itr2.hasNext()) {
			Map.Entry mEntry = (Map.Entry)itr2.next();
			System.out.println(mEntry.getKey() +":");
			System.out.println(mEntry.getValue());
			
		}
		
		System.out.println();
		
		//Deposit 100
		int d = ((Integer)m1.get("code")).intValue();
		m1.put("code", new Double(d +1000));
		System.out.println("The new balance is: "+ m1.get("code"));
	}
	
	
	
}
