package com.Base_Class;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class Base_Class {
	
	public static WindowsDriver driver;
	
	private void launch() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("app", "C:\\Program Files (x86)\\Ericom Software\\PowerTerm\\ptw32.exe");
		cap.setCapability("platform", "Windows");
		cap.setCapability("deviceName", "WindowsPC");

		driver = new WindowsDriver (new URL("http://127.0.0.1:4723"), cap);

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

	}

}
