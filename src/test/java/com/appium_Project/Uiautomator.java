package com.appium_Project;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class Uiautomator extends Base implements Config_Setup{
  
	
	@org.junit.Test
	public void appium_Execution() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Config_Setup.androidInitEmulator_Device();
	
		/*
		 * ("attribute("value")") use escapes
		 */
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3D Transition\")").click();
		int noOfClickableFalse = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size();
		int noOfClickableTrue = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size();
		System.out.println("Cliackable items "+noOfClickableTrue+"\n"+"Cliackable items "+noOfClickableFalse);
		driver.findElementByAndroidUIAutomator("text(\"Lyon\")").click();
		Thread.sleep(1000);
		driver.close();
  
	}
}
