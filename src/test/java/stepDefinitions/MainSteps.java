package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

/**
 * MainSteps Class
 * ------------------------------
 * This class contains the step definitions that map Gherkin steps
 * from feature files to executable Java code.
 *
 * Key Concepts:
 * - Each method is annotated with @Given, @When, or @Then, which
 *   binds it to the matching step in the feature file.
 * - Parameters in steps (like {string}, regex, or DataTables)
 *   are automatically passed to the Java method arguments.
 * - This is where Selenium WebDriver code (to interact with browsers)
 *   would normally be written. Currently, we use simple System.out
 *   statements for demonstration purposes.
 */
public class MainSteps {

    // ========================
    // Background Step Definitions
    // ========================

    @Given("Setup the entries in database")
    public void setup_the_entries_in_database() {
        System.out.println("*****************************");
        System.out.println("Setup the entries in database");
        // Here you would prepare test data or database state before execution.
    }

    @When("Launch the browser from config variables")
    public void launch_the_browser_from_config_variables() {
        System.out.println("Launch the browser from config variables");
        // Example: Read browser type (Chrome/Firefox) from config file and launch WebDriver.
    }

    @When("Hit the home page url of banking site")
    public void hit_the_home_page_url_of_banking_site() {
        System.out.println("Hit the home page url of banking site");
        // Example: driver.get("https://bankingsite.com");
    }

    // ========================
    // Login Scenarios
    // ========================

    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        System.out.println("User is on NetBanking landing page");
        // Example: Validate page title or landing page elements.
    }

    @When("User login into application with {string} and password {string}")
    public void user_login_into_application(String username, String password) {
        System.out.println("User login into application with " + username + " and password " + password);
        // Example: Enter username & password into fields and click login.
    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        System.out.println("Home Page is displayed");
        // Example: Assert that the user is redirected to the Home page.
        // Assert.assertTrue(driver.getTitle().contains("Home"));
    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards are displayed");
        // Example: Validate that card-related UI elements are visible.
    }

    // ========================
    // Parameterized Login (Scenario Outline)
    // ========================

    /**
     * Step definition for parameterized login steps using regex.
     * Matches steps like:
     *   When User login into application with debituser and password hello123 combination
     *
     * Regex explanation:
     *   (.+) → captures any value (username, password) from the step text.
     */
    @When("^User login into application with (.+) and password (.+) combination$")
    public void user_login_into_application_with_and_password_combination(String username, String password) {
        System.out.println("User login into application with " + username + " and password " + password);
    }

    // ========================
    // Signup Scenario (Data Table)
    // ========================

    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        System.out.println("User is on Practice landing page");
        // Example: Navigate to Practice page for Sign-up.
    }

    /**
     * Handles Sign-up step with DataTable input from feature file.
     * Example input:
     *   | Ravindu            |
     *   | Haputhanthri       |
     *   | ravinduheshan99@gmail.com |
     *   | 0775165666         |
     *
     * Data is passed as a List<String>, and each row is retrieved using get(index).
     */
    @When("User Signup into application")
    public void user_signup_into_application(List<String> data) {
        System.out.println(data.get(0)); // First Name
        System.out.println(data.get(1)); // Last Name
        System.out.println(data.get(2)); // Email
        System.out.println(data.get(3)); // Phone
        // Example: Enter signup details into form fields and submit.
    }
}
