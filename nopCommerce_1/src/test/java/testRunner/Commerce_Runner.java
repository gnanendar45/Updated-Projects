package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
               (features="C:\\Users\\admin\\eclipse-workspace\\nopCommerce_1\\Features\\Coustomer.feature",
               glue="stepDefination",
               dryRun=false,
               monochrome = true,
               plugin = {"pretty","html:test-output"}
               )
public class Commerce_Runner {
	

}
