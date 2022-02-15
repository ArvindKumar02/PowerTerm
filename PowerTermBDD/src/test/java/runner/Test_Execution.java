package runner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefinition" }, monochrome = true,

		plugin = { "pretty","html:Report/HTMLReports.html", "json:JsonReport/Report.json",
				
		})
//"html:Report/HTMLReports", "json:JsonReport/Report.json", "pretty",
//"com.cucumber.listerners.ExtentCucumberFormatter:ExtentReport/File.html"
//"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
public class Test_Execution {

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
