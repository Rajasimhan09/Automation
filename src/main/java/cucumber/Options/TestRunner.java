package cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "resources",
		plugin ={"pretty:target/pretty","json:target/cucumber.json","html:target/cucumber.html"},
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		glue={"stepDefinitions"},
		monochrome = true,
		dryRun = false,
		tags = "@assessment"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
