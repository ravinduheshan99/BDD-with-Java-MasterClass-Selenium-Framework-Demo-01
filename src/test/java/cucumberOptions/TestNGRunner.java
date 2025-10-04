package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * TestNGRunner Class
 * -------------------
 * This class is responsible for running the Cucumber test scenarios using TestNG.
 * It acts as the "entry point" for the BDD framework.
 *
 * - The @CucumberOptions annotation is used to configure the Cucumber framework.
 * - Extending AbstractTestNGCucumberTests integrates Cucumber with TestNG,
 *   so scenarios can be executed and reported through TestNG.
 */
@CucumberOptions(
        // Path to the feature files (written in Gherkin syntax).
        // Cucumber will look here to find test scenarios to execute.
        features = "src/test/java/features",

        // If true, Cucumber will only check if steps have step definitions (without actually running them).
        // Useful for quickly verifying if all steps are implemented.
        dryRun = true,

        // Package location where step definition classes are stored.
        // This is how Cucumber links feature steps to Java methods.
        glue = "stepDefinitions",

        // Makes the console output more readable by removing unnecessary characters.
        monochrome = true,

        // Used to filter which scenarios to run based on tags in the feature files.
        // Example: Run all scenarios tagged with @SmokeTest OR @RegressionTest.
        tags = "@SmokeTest or @RegressionTest",

        // Defines reporting options:
        // - pretty: better console output
        // - html: generates an HTML report in target folder
        // - json: generates a JSON report for integrations (e.g., Jenkins, ExtentReports)
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
    // No code needed inside this class.
    // Execution is managed by TestNG + Cucumber configuration above.
}
