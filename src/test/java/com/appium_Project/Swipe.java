package com.appium_Project;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/*
 * Xpath //tagname[@attribute=value]
 * //*[@attribute=value]
 */


public class Swipe extends Base implements Config_Setup{

	public static void main(String[] args) throws MalformedURLException {
	
		//new Swipe().scrollDemo();
		new Swipe().swipeDemo();
	}
	
	
	/*
	 * Swipe an element in Android
	 */
	public void swipeDemo() throws MalformedURLException {
	
		AndroidDriver<AndroidElement> driver = Config_Setup.androidInitEmulator_Device();
	
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		TouchAction swipe = new TouchAction(driver);
		WebElement source = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement destination = driver.findElementByXPath("//*[@content-desc='45']");
		swipe.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveTo(element(destination)).release().perform();


	}
	
	/*
	 * SCROLLING DEMO
	 */
	public void scrollDemo() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Config_Setup.androidInitEmulator_Device();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
	}
}