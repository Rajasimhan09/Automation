package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.DriverManager;


public class Hooks {

	public static Scenario scenario;

	@Before
	public void scenarioStart(Scenario scenario) {
		Hooks.scenario = scenario;
		String scenarioName = scenario.getName();

	}

	@AfterStep
	public void stepFinish(Scenario scenario) {
		if(DriverManager.driver!=null)
			scenario.attach(((TakesScreenshot)DriverManager.driver).getScreenshotAs(OutputType.BYTES), "image/png", "Screensshot");
	}

	@After
	public void tearDown(Scenario scenario) {	
		//if(scenario.isFailed())
		if(DriverManager.driver!=null) {
			scenario.attach(((TakesScreenshot)DriverManager.driver).getScreenshotAs(OutputType.BYTES), "image/png", "Screensshot");
			DriverManager.driver.quit();
			DriverManager.driver=null;
		}
		
	}
}