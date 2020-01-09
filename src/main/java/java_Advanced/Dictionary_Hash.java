package java_Advanced;

import java.io.ObjectOutputStream.PutField;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;

public class Dictionary_Hash {

	public static void main(String[] args) {
	
		try {
			Dictionary_Hash d = new Dictionary_Hash();
			d.mapping();
			d.hashTable();
		} catch (NoSuchElementException ex) {
		   System.out.println("The Element is Not found "+ ex.getMessage());
		}
	}
	
	public void mapping() {
		Map m1 = new HashMap();
		m1.put(new String("lo"), new Integer(1));
		System.out.println(m1);
		System.out.println();
		
		Map<String, Integer> m2 = new HashMap<String,Integer>();
		m2.put("cash",2);
		System.out.println(m2);
	}
	
	public void hashTable() {
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;
	
		
		balance.put(new String("Zara"),38383.33);
		balance.put("Edgers", new Double(3048494.33));
		
		names = balance.keys();
		
		while (names.hasMoreElements()) {
			str = (String)names.nextElement();
			System.out.println(str + " : "+balance.get(str));
		}
		
		System.out.println();
		
		bal = ((Double)balance.get("Zara")).doubleValue();

	
		System.out.println("Zara new balance is "+bal+1000+"\n");
		System.out.println(balance.get("Zara"));

		
	}
	
}
