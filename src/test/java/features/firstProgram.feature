Feature: Application Login

  Background:
    Given  Setup the entries in database
    When Launch the browser from config variables
    And Hit the home page url of banking site

  @RegressionTest
  Scenario: Admin Page default login
    Given User is on NetBanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

  #Reusable

  @MobileTest
  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with "user" and password "5678"
    Then Home Page is displayed
    And Cards are displayed

#  Scenario Outline: User Page default login
#    Given User is on NetBanking landing page
#    When User login into application with "<Username>" and password "<Password>" combination
#    Then Home Page is displayed
#    And Cards are displayed

  @SmokeTest @RegressionTest
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

  @SmokeTest
  Scenario: User Page default Sign up
    Given User is on Practice landing page
    When User Signup into application
    | Ravindu |
    | Haputhanthri |
    | ravinduheshan99@gmail.com |
    | 0775165666 |
    Then Home Page is displayed
    And Cards are displayed