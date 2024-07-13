package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = {"com/StepDefinationAmezon"},
                  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags= "@tc007")
public class Runners_Amezon {

	
}
