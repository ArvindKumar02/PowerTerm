package com.StepDefinition;

import com.PowerTerm.Runner_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.windows.WindowsDriver;

public class Step_Definition {

	public static WindowsDriver driver = Runner_Class.driver;
	
	

	@Given("^user Launches the Application$")
	public void user_Launches_the_Application() throws Throwable {
		driver.findElementByName("File").click();
	}

	@When("^user clicks close to close the application$")
	public void user_clicks_close_to_close_the_application() throws Throwable {
		driver.findElementByName("Close").click();
	}
}
