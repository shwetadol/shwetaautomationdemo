Feature: feature to test labcorp login funtionality

  Scenario Outline: Check login is successful with valid labcorp credentials
    Given user is on login page
    When user enter <username> and <password>
    And click on login button
    Then user is navigated to home page

    Examples: 
      | username                | password  |
      | Shwetaorders@yopmail.com | Labcorp3* |
    
