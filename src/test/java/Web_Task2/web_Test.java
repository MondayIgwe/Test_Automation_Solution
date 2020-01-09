package Web_Task2;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import pageObjects.testBaseSeup;


@RunWith(SerenityRunner.class)
public class web_Test extends testBaseSeup {

	
	@Step
	@org.junit.Test
	public void homePage(){
		try 
		{
			getTitle();
			tearDown();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
