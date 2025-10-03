Feature: Application Login

  Scenario: Admin Page default login
    Given User is on NetBanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

  #Reusable

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

  Scenario Outline: User Page default login
    Given User is on NetBanking landing page
    When User login into application with <Username> and password <Password> combination
    Then Home Page is displayed
    And Cards are displayed

  Examples:
    | Username   | Password |
    | debituser  | hello123 |
    | credituser | hello456 |
    | chequeuser | 123456   |