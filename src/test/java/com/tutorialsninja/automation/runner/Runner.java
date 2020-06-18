package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Register.feature",
	"classpath:FeatureFiles/Login.feature", 
	"classpath:FeatureFiles/Search.feature"},
//@CucumberOptions(features={"classpath:FeatureFiles/Login.feature"},
//@CucumberOptions(features={"classpath:FeatureFiles/Search.feature"},
//@CucumberOptions(features={"classpath:FeatureFiles/Orders.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},
plugin={"html:target/cucumber_html_report"})
//tags={"@Register", "@Two"})
//tags={"@Login"})
//tags={"@Search"})
//tags={"@Orders",  "@One"})
public class Runner {

}
