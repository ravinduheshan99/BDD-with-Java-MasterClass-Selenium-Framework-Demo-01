package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

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

    @When("User login into application with {string} and password {string} combination")
    public void user_login_into_application_with_and_password_combination(String username, String password) {
        System.out.println("User login into application with "+username+ " and password "+password);
    }

}
