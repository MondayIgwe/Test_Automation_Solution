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

public class HybridBase {
	
	private static String serverUrl = "http://127.0.0.1:4723/wd/hub";
	
	public static AndroidDriver<AndroidElement> setDesiredCapabilties(String device) throws MalformedURLException{
		
		/*
		 * Set the Desired Capabilities
		 */
		
		AndroidDriver<AndroidElement>  driver;
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	    if(device.equals("emulator")) {
	    	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MondayEmulatorTest");
	    	capabilities.setCapability(MobileCapabilityType.APP,apk_File().getAbsolutePath());
	    	capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.16.0");
	    }
	    else if (device.equals("real")) {
	    	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	    	capabilities.setCapability(MobileCapabilityType.APP,apk_File().getAbsolutePath());
	    }
	    else if (device.equals("chrome")) {
	    	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	    	capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		}
	    else 
	    {
			System.out.println("Devices Not Found, Please select a valid Device");
		}
	
		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	
		driver = new AndroidDriver<>(new URL(serverUrl),capabilities);
	   
	   return driver;
	}
	
	
	public static File apk_File() {
		/*
		 * Pass the Absolute APK File Path
		 */
		File file = new File("app");
		File fs = new File(file,"ApiDemos-debug.apk");
		return fs;	
	}
	

}
