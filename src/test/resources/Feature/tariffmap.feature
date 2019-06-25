@tag
Feature: TarifMap
  

  @tag1
  Scenario: Tariff_Map
    Given The user is using telecom home page
    And  User will click add tariff
    When user have to fill the details
    |MonthlyRent|50000|
    |Freelocalmins|300|
    |Intermins|6000|
    |FreeSMS|5000|
    |LocalPM|200|
    |InterPM|230|
    |SMSPercharge|100|
   
    
    And submit
   
    Then success
 

