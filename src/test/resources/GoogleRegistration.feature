Feature: Google registration
  In order to test registration form
  As a new user
  I want to create an account

  Scenario: User can register for a new Google account

    Given the user is on the Google account registration page
    When the user enters their first name, last name, username, password, and confirms the password as follows
    And the user clicks on the "Next" button
    Then close browser
