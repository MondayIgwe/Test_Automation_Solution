package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class basePage {

	protected WebDriver driver;	
	
	
	//private By signIn =  By.linkText("");
	
	public basePage(WebDriver driver)throws Exception {
		this.driver=driver;
	}
	
	public String getTitle() throws Exception {
		String title = driver.getTitle();
		return title;
	}
	
	

}
