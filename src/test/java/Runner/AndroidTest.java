package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="D:/PIP/src/test/FeaturesPIP/Features/Login.feature",
        monochrome = true,
//        tags = "@login",
        plugin = {"json:target/cucumber.json", "pretty","html:target/cucumber-reports.html"},
        glue = {"org.example.stepdefs"})

public class AndroidTest extends AbstractTestNGCucumberTests {
}
