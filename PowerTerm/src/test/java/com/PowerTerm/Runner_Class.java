package com.PowerTerm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.windows.WindowsDriver;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features ="src\\test\\java\\com\\FeatureFile\\PowerTerm.feature",
		
		glue = "com.StepDefinition",
		monochrome = true,
		plugin = {
				"html:Report/HTMLReport","json:JsonReport/Report.json","pretty",
				//"com.cucumber.listerners.ExtentCucumberFormatter:ExtentReport/File.html"
				
		}
		
		)



public class Runner_Class {
	
	public static WindowsDriver driver;
	
	@BeforeClass
	public static void SetUp() throws MalformedURLException {
		
		
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("app", "C:\\Program Files (x86)\\Ericom Software\\PowerTerm\\ptw32.exe");
		cap.setCapability("platform", "Windows");
		cap.setCapability("deviceName", "WindowsPC");

		driver = new WindowsDriver (new URL("http://127.0.0.1:4723"), cap);

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		

	}
	
	@AfterClass
	public static void TearDown() {
		
		driver.close();
		

	}

}
