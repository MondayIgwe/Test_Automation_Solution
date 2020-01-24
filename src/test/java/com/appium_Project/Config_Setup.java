/**
 * 
 */
package com.appium_Project;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.yecht.Data.Str;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author  Monday
 * IF DEVICE IS SHOWING UNAUTHORIZED
 * 
 * e.g  adb devices
 * adb kill-server
 * adb start-server
 * adb devices
 *
 */
public interface Config_Setup {
	WebDriver driver = null;
	
	/*
	 * Emulator Device Config
	 */
	static AndroidDriver<AndroidElement> androidInitEmulator_Device()throws MalformedURLException{
		/*
		 * Call the Base Class
		 */
		Base base = new Base();
		
		AndroidDriver<AndroidElement> driver=base.setDesiredCapabilties();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		return driver;
	
	}
	
	
	/*
	 * Real Device Config
	 */
	static AndroidDriver<AndroidElement> androidInitReal_Device(String device)throws MalformedURLException{
		/*
		 * Call the HybridBase Class
		 */
		HybridBase base = new HybridBase();
		
		AndroidDriver<AndroidElement> driver=base.setDesiredCapabilties(device);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		return driver;
	
	}

	/*
	 *  JavaSCRIPT EXECUTOR
	 */
	
	static void scroll()throws Exception {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,1000)");
	   
	}
}
