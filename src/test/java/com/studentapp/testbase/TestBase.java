package com.studentapp.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class TestBase {
	
	static Properties prop = new Properties();
	
	@BeforeClass
	public static void Init() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/application.properties");
		prop.load(file);	
		RestAssured.baseURI = prop.getProperty("ApiUrl");	
	
	}
}
