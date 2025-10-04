# ================================================================
# Feature File: ApplicationLogin2.feature
# ================================================================
# This feature file tests login functionality for different user roles.
#
# Key Notes:
# - Execution Order: Hooks (@Before) -> Background -> Scenario -> Hooks (@After)
# - Background: Defines common pre-conditions to avoid duplication.
# - Tags: Used to group and selectively run tests (@MobileTest, @NetBanking, @Mortgage).
# - Scenario Outline + Examples: Data-driven testing approach for multiple user credentials.
# ================================================================

Feature: Application Login

  # ---------------------------------------------------------------
  # Background: Common steps run before every scenario in this feature file.
  # In this case, launching the browser and opening the home page.
  # ---------------------------------------------------------------
  Background:
    When Launch the browser from config variables
    And Hit the home page url of banking site

  # ---------------------------------------------------------------
  # Scenario: Simple login validation for a regular user.
  # Tagged with:
  #   @MobileTest   → indicates this test belongs to the Mobile test suite.
  #   @NetBanking   → indicates this test belongs to the NetBanking module.
  # ---------------------------------------------------------------
  @MobileTest @NetBanking
  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with "user" and password "5678"
    Then Home Page is displayed
    And Cards are displayed

  # ---------------------------------------------------------------
  # Scenario Outline: Parameterized login test for different mortgage users.
  # Tagged with:
  #   @MobileTest   → included in Mobile test executions.
  #   @Mortgage     → specific to Mortgage module functionality.
  #
  # The "Examples" section provides multiple sets of credentials
  # that will be tested one by one in separate test runs.
  # ---------------------------------------------------------------
  @MobileTest @Mortgage
  Scenario Outline: Mortgage User Page default login
    Given User is on NetBanking landing page
    When User login into application with <Username> and password <Password> combination
    Then Home Page is displayed
    And Cards are displayed

    # Example datasets → Each row will trigger one execution of the scenario above.
    Examples:
      | Username   | Password |
      | debituser  | hello123 |
      | credituser | hello456 |
      | chequeuser | 123456   |
