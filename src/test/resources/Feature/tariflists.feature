@tag
Feature: Titletariff


  @tag1
  Scenario: Title_tariff
    Given user_telecom home page
    And User clicks add tariff 
    When complete all actions
    | 2000  | 2000 | 3000  | 5000  | 6000 | 7000  | 6000 |
    And  give submit button
    Then my confirmation page


 
