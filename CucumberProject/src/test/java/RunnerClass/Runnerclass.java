package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/featureFile/", 
		glue="StepDefiniation",
		strict = true, 
		monochrome = true, 
		plugin={"json:reports/jsonreport.json","html:reports/webreport","junit:reports/xmlreport.xml"},
		tags = {"@AmazonFeature"}
		
		)

public class Runnerclass {

}
