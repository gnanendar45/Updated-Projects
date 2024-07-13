package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		         features="src\\test\\resources\\features\\Login.feature",monochrome = false,
		         glue="stepDefination",
		        // tags = "@all",
		         dryRun = true,
		         publish = true,
		         plugin = {"pretty",
		        		 "html:target/CucumberReport/CucumberReport.html",
		        		 "json:target/CucumberReport/CucumberReport.json",
		        		 "junit:target/CucumberReport/CucumberReport.xml"}
                          )
public class Testrunner {
	
		

}
