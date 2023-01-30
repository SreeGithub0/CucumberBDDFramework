Feature: check login functionality

  Scenario:
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to the home page

    Examples:
      | username                | password      |
      | sri@gmail.com | 1234    |
      | vinay123                | innovapath123 |
      | vastav                  | innovapath    |
