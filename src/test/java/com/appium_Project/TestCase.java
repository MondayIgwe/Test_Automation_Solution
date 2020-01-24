package com.appium_Project;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.serenitybdd.junit.runners.SerenityRunner;


@RunWith(SerenityRunner.class)
public class TestCase extends Base {

	public String realDevice = "real";
	public String emulatorDevice = "emulator";
	
	@org.junit.Test
	public void appium_Execution() throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = Config_Setup.androidInitReal_Device(realDevice);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		/*
		 * xpath, id, class, an
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		Thread.sleep(1000);
		driver.findElementByClassName("android.widget.EditText").sendKeys("Monsdasd");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		driver.close();
	}


}
