package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {

    @Given("Setup the entries in database")
    public void setup_the_entries_in_database() {
        System.out.println("*****************************");
        System.out.println("Setup the entries in database");
    }

    @When("Launch the browser from config variables")
    public void launch_the_browser_from_config_variables() {
        System.out.println("Launch the browser from config variables");
    }

    @When("Hit the home page url of banking site")
    public void hit_the_home_page_url_of_banking_site() {
        System.out.println("Hit the home page url of banking site");
    }


    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        System.out.println("User is on NetBanking landing page");
    }

    @When("User login into application with {string} and password {string}")
    public void user_login_into_application(String username, String password) {
        System.out.println("User login into application with "+username+ " and password "+password);
    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        System.out.println("Home Page is displayed");
    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards are displayed");
    }

//    @When("User login into application with {string} and password {string} combination")
//    public void user_login_into_application_with_and_password_combination(String username, String password) {
//        System.out.println("User login into application with "+username+ " and password "+password);
//    }

    @When("^User login into application with (.+) and password (.+) combination$")
    public void user_login_into_application_with_and_password_combination(String username, String password) {
        System.out.println("User login into application with "+username+ " and password "+password);
    }

    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        System.out.println("User is on Practice landing page");
    }

    @When("User Signup into application")
    public void user_signup_into_application(List<String> data) {
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));

    }

}
