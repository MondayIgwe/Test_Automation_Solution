package com.appium_Project;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Generic_gestures implements Config_Setup {

	public String realDevice = "real";
	public String emulatorDevice = "emulator";
	public String browser = "chrome";
	
	

	public static void main(String[] args) throws Exception {
		Generic_gestures execute = new Generic_gestures();
		//execute.tapElement();
		execute.dragAndDrop();
		//execute.browser();
	}
	
	
	public void browser() throws Exception {
		AndroidDriver<AndroidElement> driver = Config_Setup.androidInitReal_Device(browser);
		driver.get("https://www.google.com/");
		WebElement cl = driver.findElementByXPath("//*[@name='q']");
		cl.sendKeys("LinkedIn");
		cl.click();
		Thread.sleep(5000);
		
		driver.get("https://m.cricbuzz.com/");
		driver.findElementByXPath("//a[@href='#menu']").click();
		Thread.sleep(2000);
		driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		//Config_Setup.scroll();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.close();
	}
	
	
	/*
	 * Tap Android Element
	 */
	public void tapElement() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Config_Setup.androidInitReal_Device(emulatorDevice);

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		// Tap an element on Mobile Apps
		TouchAction touch = new TouchAction(driver);
		WebElement webElement = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		touch.tap(tapOptions().withElement(element(webElement))).perform();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement per = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		touch.longPress(longPressOptions().withElement(element(per)).withDuration(ofSeconds(2))).release().perform();

		Thread.sleep(1000);
		// Return Value
		String stringValue = driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").getText();
		System.out.println("The Value is: " + stringValue);
		driver.close();
	}

	/*
	 * Drag and Drop
	 */

	public void dragAndDrop() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Config_Setup.androidInitReal_Device(realDevice);

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		WebElement dragNdrop = driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']");
		dragNdrop.click();

		Thread.sleep(1000);
		WebElement source = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		WebElement destination = driver.findElementById("io.appium.android.apis:id/drag_dot_3");

		TouchAction drag = new TouchAction<>(driver);
		drag.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2)))
				.moveTo(element(destination)).release().perform();
		driver.close();
	}
}
