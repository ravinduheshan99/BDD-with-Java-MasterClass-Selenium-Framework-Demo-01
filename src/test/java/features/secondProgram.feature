Feature: Application Login

# Execution Order ------> Before Annotation in Hooks -> Background -> Scenario -> After Annotation in Hooks

  Background:
    When Launch the browser from config variables
    And Hit the home page url of banking site

  @MobileTest @NetBanking
  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with "user" and password "5678"
    Then Home Page is displayed
    And Cards are displayed

  @MobileTest @Mortgage
  Scenario Outline: Mortgage User Page default login
    Given User is on NetBanking landing page
    When User login into application with <Username> and password <Password> combination
    Then Home Page is displayed
    And Cards are displayed

  Examples:
    | Username   | Password |
    | debituser  | hello123 |
    | credituser | hello456 |
    | chequeuser | 123456   |