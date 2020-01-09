package java_Advanced;

import java.util.*;

public class Properties {


	
	public static void main(String[] args) {
		Map<String, String> capitals = new HashMap<String, String>();
		Set state;
		String str;
		
		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		
		state = capitals.keySet(); 
		
		Iterator itr = state.iterator();
		while (itr.hasNext()) {
			str = (String)itr.next();
			System.out.println("The capital of "+ str + "is "+ capitals.get("Indiana"));
			
		}
		
	}
}
