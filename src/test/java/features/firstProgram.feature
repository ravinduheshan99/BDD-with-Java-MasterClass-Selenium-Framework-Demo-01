# ================================================================
# Feature File: ApplicationLogin.feature
# ================================================================
# This file contains BDD scenarios for testing the login functionality
# of a banking web application using Cucumber and Selenium.
#
# Key concepts used here:
# - Feature: Describes the functionality under test.
# - Background: Common steps that will be executed before each scenario.
# - Scenario: A concrete example/test case written in Gherkin syntax.
# - Scenario Outline + Examples: Data-driven testing (parameterization).
# - Tags (@SmokeTest, @RegressionTest, etc.): Used to group/filter tests.
# - Data Tables: For providing structured data inputs to steps.
# ================================================================

Feature: Application Login
  # The "Feature" keyword describes the business functionality being tested.
  # In this case: Login functionality of the NetBanking application.

  Background:
    # Background steps are executed before every Scenario/Scenario Outline in this feature file.
    # This avoids repetition of common preconditions.
    Given  Setup the entries in database
    When Launch the browser from config variables
    And Hit the home page url of banking site

  @RegressionTest
  Scenario: Admin Page default login
    # A simple scenario for testing Admin login.
    # The steps are mapped to corresponding Java step definitions.
    Given User is on NetBanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

  # ---------------------------------------------------------------
  # Another test scenario for user login (reusable format).
  # Tagged with @MobileTest to group for mobile execution if required.
  # ---------------------------------------------------------------
  @MobileTest
  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with "user" and password "5678"
    Then Home Page is displayed
    And Cards are displayed

  # ---------------------------------------------------------------
  # Example of a Scenario Outline (parameterized test).
  # This helps run the same scenario multiple times with different data sets.
  # Tags allow grouping (this one will run for both Smoke and Regression test suites).
  # ---------------------------------------------------------------
  @SmokeTest @RegressionTest
  Scenario Outline: Mortgage User Page default login
    Given User is on NetBanking landing page
    When User login into application with <Username> and password <Password> combination
    Then Home Page is displayed
    And Cards are displayed

    # Example data table for multiple iterations of the above scenario
    Examples:
      | Username   | Password |
      | debituser  | hello123 |
      | credituser | hello456 |
      | chequeuser | 123456   |

  # ---------------------------------------------------------------
  # Example of using a Data Table to pass multiple inputs to a step.
  # Instead of inline parameters, the step consumes tabular data.
  # ---------------------------------------------------------------
  @SmokeTest
  Scenario: User Page default Sign up
    Given User is on Practice landing page
    When User Signup into application
      | Ravindu            |
      | Haputhanthri       |
      | ravinduheshan99@gmail.com |
      | 0775165666         |
    Then Home Page is displayed
    And Cards are displayed
