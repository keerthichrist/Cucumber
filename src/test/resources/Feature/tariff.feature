@tag
Feature: mytariffs
  
  
  @tag1
  Scenario: TariffPlan
    Given User is in telecom page
    And Add tariff plan is clicked
    When Fill the details
    And submit button
    Then final confirmation page
 
