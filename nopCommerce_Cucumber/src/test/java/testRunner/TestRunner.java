package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        features="C:\\Users\\admin\\eclipse-workspace\\nopCommerce_Cucumber\\Features\\Coustmores.feature",
        glue="stepDefinations",
        dryRun=false,
        monochrome = true,
        plugin= {"pretty",
        		"html:test-output"}
		
		)
public class TestRunner {

}
