package com.studentapp.utils;
import java.util.Random;
import org.junit.Test;

public class TestUtils {


	public static String getRandomValue() {
		Random random = new Random();
		int radInt = random.nextInt(10000);
		System.out.println(Integer.toString(radInt));
		return Integer.toString(radInt);
	}
	
	//@Test
//	public void givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect() {
//	    int leftLimit = 97; // letter 'a'
//	    int rightLimit = 122; // letter 'z'
//	    int targetStringLength = 10;
//	    Random random = new Random();
//	 
//	    String generatedString = random.ints(leftLimit, rightLimit + 1)
//	      .limit(targetStringLength)
//	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//	      .toString();
//	 
//	    System.out.println(generatedString);
//	}

}
