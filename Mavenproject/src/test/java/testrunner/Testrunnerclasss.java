package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
				features="C:\\Users\\balaji.govindarajan\\eclipse-workspace\\Mavenproject\\src\\test\\java\\featurepackage\\multiplefiles.feature",
				glue="stepdefenition",
				dryRun=false,
				monochrome=true
				
				
			)
public class Testrunnerclasss {

}
