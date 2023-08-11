Feature: Login with valid credentials & log out

  As a customer I want to be able to login to application providing valid credentials.

  @Start
  Scenario Outline: Login to app
    Given the app login page is open
    When the user enters correct <username> and <password>
    Then the user is logged in

    Examples:
      | username     | password     |
      | standar_user | secret_sauce |
      | problem_user | secret_sauce |


  @Stop
  Scenario: Login to app
    Given the user is logged in
    When the user logs out
    Then the app login page is open