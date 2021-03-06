package StepDefinition;

import java.util.Optional;

import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.Test_Execution;



public class PowerTerm1 {
	
	public static WindowsDriver driver = Test_Execution.driver;
	
	@Given("user launchs Application")
	public void user_launchs_application() {
		driver.findElementByName("Close").click();
		System.out.println("Launch Application");
	   
	}

	@When("user enters KMBL and KOTAK")
	public void user_enters_kmbl_and_kotak() {
		driver.findElementByName("File").click();
		driver.findElementByName("Print Setup...").click();
		driver.findElementByName("OK").click();
	    
	}

	@Then("user is navigated to Working Page")
	public void user_is_navigated_to_working_page() {
		driver.findElementByName("Communication").click();
		driver.findElementByName("Utilities").click();
		driver.findElementByName("Break").click();
		driver.findElementByName("OK").click();
		System.out.println("Communication Status: OK");
	   
	}

	@Given("user closess the connect Window")
	public void user_closess_the_connect_window() {
		driver.findElementByName("Options").click();
		driver.findElementByName("Power Pad Setup...").click();
		driver.findElementByName("Cancel").click();
		System.out.println("Options Status: OK");
		
	    
	}

	@Given("user is navigated to working Space")
	public void user_is_navigated_to_working_space() {
		driver.findElementByName("Help").click();
		driver.findElementByName("About PowerTerm InterConnect Demo...").click();
		driver.findElementByName("OK").click();
		System.out.println("Help Status: OK");
		
	    
	}

	@Then("user closes the Application")
	public void user_closes_the_application() {
		
		System.out.println("Application Closed");
	    
	}

}
