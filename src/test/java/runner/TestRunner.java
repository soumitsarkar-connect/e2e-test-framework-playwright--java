package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@footer",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class TestRunner {
    /*this class will be empty*/
}
