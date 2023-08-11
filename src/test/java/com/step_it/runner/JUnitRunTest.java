package com.step_it.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/login"},
        glue = {"com.step_it.step_definitions", "com.step_it.hooks"},
        tags = "",
        plugin = {"pretty",
                "json:test-output/cucumber-reports/Cucumber.json",
                "json:test-output/cucumber-reports/Cucumber.xml",
                "json:test-output/cucumber-reports/Cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)

public class JUnitRunTest {
}