package java_Advanced;

public class Regular_Expression {

	public static void main(String[] args) {


		String phone = "+16363-383-(6556)";		
		String pattern = "[^^A-Za-z0-9]()";
		String str = phone.replaceAll(pattern, "");
		System.out.println(str);
		
		System.out.println();
		
		String patt = "abc?";
		String str1 = "abc";
		boolean result = str1.matches(patt);
		System.out.println(result);
		
		System.out.println();
		
		String pat1 = "\\d";
		String pat2 = "\\w";
		String pat3 = "\\s";
		String pat4 = "\\D{2,9}";
		String pat5 = "^[a-z]at";
		
		String digit = "5";
		String words = "A";
		String space = " ";
		String nonDigits = "$%@!";
		String myBrackect = "%at";
		
		System.out.println("Digits is: "+digit.matches(pat1)
		+"\n"+"Words: "+words.matches(pat2)
		+"\n"+"Space in between words: "+space.matches(pat3)
		+"\n"+"Non Digits: "+nonDigits.matches(pat4)
		+"\n"+"Brackect "+myBrackect.matches(pat5));
		
	}

}
