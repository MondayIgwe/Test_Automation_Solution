package com.studentapp.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;
import io.restassured.RestAssured;

public class TestBase {
	
	static Properties prop = new Properties();
	
	@BeforeClass
	public static void Init() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/application.properties");
		prop.load(file);	
		RestAssured.baseURI = prop.getProperty("ApiUrl");	
	
	}
	
	@BeforeTest
	public void init2() throws Exception {
		FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"/env.properties");
		prop.load(inputStream);
		RestAssured.baseURI = prop.getProperty("HOST");
	}
	
	
//    @BeforeTest
//    public void setPath(){
//        System.setProperty("webdriver.chrome.driver", "selenium/chromedriver_win32/chromedriver.exe");
//
//    }
}
