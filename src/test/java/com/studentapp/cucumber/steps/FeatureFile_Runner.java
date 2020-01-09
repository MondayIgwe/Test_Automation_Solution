package com.studentapp.cucumber.steps;

import org.junit.runner.RunWith;

import com.studentapp.testbase.TestBase;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features")
public class FeatureFile_Runner extends TestBase {

	
}
