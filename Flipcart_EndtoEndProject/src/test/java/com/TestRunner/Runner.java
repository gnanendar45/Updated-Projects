/*
 * package com.TestRunner;
 * 
 * import org.junit.runner.RunWith; import io.cucumber.junit.Cucumber; import
 * io.cucumber.junit.CucumberOptions;
 * 
 * @RunWith(Cucumber.class)
 * 
 * @CucumberOptions( features =
 * "src/test/resources/Features/SearchFunctionality.feature", glue =
 * {"com.StepDefination"}, // Fixed typo here // dryRun = true, monochrome =
 * false, plugin =
 * {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
 * tags = "@tc008" ) public class Runner {
 * 
 * }
 */



  package com.TestRunner;
  
  import org.junit.runner.RunWith;
  
  import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
  
  @RunWith(Cucumber.class)
  
  @CucumberOptions(features = "src/test/resources/Features/SearchFunctionality.feature",glue =
  {"com.StepDefination"},
  //dryRun = true, 
//  monochrome = false, 
  plugin =
  {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags
  = "@tc006")
  
  public class Runner {
  
  
  }
 
