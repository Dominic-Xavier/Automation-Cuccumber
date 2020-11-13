package stepdefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = {"./src/main/java/featureFiles/automation.feature"},
	glue = {"implementation"},
	dryRun = false,
	monochrome = true,
	publish = true,
	plugin = {"pretty","html:target/cucumberhtmlreport.html","json:target/cucumber-reports/cucumberTestReport.json"}
)


public class TestRunner extends AbstractTestNGCucumberTests{
	
}
