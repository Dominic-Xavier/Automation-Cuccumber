package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
	features = {"./src/main/java/featureFiles/automation.feature"},
	glue = {"implementation"},
	dryRun = false,
	monochrome = true,
	publish = true,
	plugin = {"pretty","html:target/cucumberhtmlreport","json:target/cucumber-reports/cucumberTestReport.json"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
	
}
