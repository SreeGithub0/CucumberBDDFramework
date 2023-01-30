Feature: check login functionality

  Scenario:
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to the home page

    Examples:
      | username                | password      |
      | sreedevige.84@gmail.com | Tumkur@123    |
      | vinay123                | innovapath123 |
      | vastav                  | innovapath    |