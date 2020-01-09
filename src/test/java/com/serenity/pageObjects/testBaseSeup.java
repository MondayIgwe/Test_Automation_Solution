package com.serenity.pageObjects;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;



@RunWith(SerenityRunner.class)
public class testBaseSeup {

	@Managed
	private static WebDriver driver;
	
	static final String  driverPath = "C:/Users/groov/eclipse/Automation_TestDevelop/selenium/chromedriver_win32/";
	
	private static void setDrivers(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	
	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching FireFox with new profile..");
		System.setProperty("webdriver.firefox.driver", driverPath
				+ "chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	
	public static String getChrome() {
		String chromeBrowseType = "chrome" ;
		return chromeBrowseType;
	}
	
	public static String getUrl() {
		//String url = "https://www.flightcentre.co.za";
		String url ="https://www.linkedin.com";
		return url;
	}
	
	public void getTitle() throws Exception {
		System.out.println("The page title is "+driver.getTitle().toString());
	}
	
	@org.junit.BeforeClass
	public static void initiateTestSetUp() throws Exception {
	 
		try {
			setDrivers(getChrome(), getUrl());
		}catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
	

	public void tearDown() {
		try {
			driver.close();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
