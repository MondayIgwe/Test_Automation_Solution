package com.appium_Project;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import jxl.StringFormulaCell;

public class Base {
	
	private static String serverUrl = "http://127.0.0.1:4723/wd/hub";
	public static File apk_File() {
		/*
		 * Pass the Absolute APK File Path
		 */
		File file = new File("app");
		File fs = new File(file,"ApiDemos-debug.apk");
		return fs;	
	}
	
	public static AndroidDriver<AndroidElement> setDesiredCapabilties() throws MalformedURLException{
		/*
		 * Set the Desired Capabilities
		 */
		
		AndroidDriver<AndroidElement>  driver;
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MondayEmulatorTest");
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.16.0");
		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capabilities.setCapability(MobileCapabilityType.APP,apk_File().getAbsolutePath());
		driver = new AndroidDriver<>(new URL(serverUrl),capabilities);
	   
	   return driver;
	}
}
