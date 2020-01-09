package com.starter.steps;

import org.openqa.selenium.WebDriver;

import com.starter.Calculator;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;


public class MathWizSteps extends PageObject {  //YOUR STEP LIBRARY

	@Managed
	WebDriver driver = null;  //The @Managed annotation tells Serenity that this is a web test
	
	Calculator calculator;
	
    String actor;  //Serenity will pass in the name of the variable (so michael in this case) into the step library.


    @Step("#actor starts with amount:{0}")  //#prefix & {0}
    public Object startsWith(int amount) {	
    	calculator = new Calculator(amount);
    	return amount;
    }

    @Step("#actor adds amount:{0}")
    public int adds(int amount) {
    	Object total = startsWith((amount) + 1);
    	calculator.add(amount);
        return(int)total;
    }

    @Step("#actor should have expectedTotal:{0}")
    public void shouldHave(int expectedTotal) {
        int result = adds(expectedTotal);
        
        System.out.println("The New result is "+result);
    }
    
    @Step("#actor should provid country details code:{0},nationality:{1}")
    public void countries(int code,String nationality) {
    	System.out.println(code +" "+nationality);
    }
}
