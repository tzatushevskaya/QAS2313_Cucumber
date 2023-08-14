package com.step_it.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/checkout"},
        glue = {"com.step_it.step_definitions", "com.step_it.hooks"},
        tags = "@Regression",
        plugin = {"pretty",
                "json:test-output/cucumber-reports/Cucumber.json",
                "json:test-output/cucumber-reports/Cucumber.xml",
                "json:test-output/cucumber-reports/Cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)

public class TestNGRunTest extends AbstractTestNGCucumberTests {
}
