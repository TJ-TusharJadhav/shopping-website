Feature: Login Functionality
  As a user, I want to log in to the application to access the dashboard.

  @tag1
  Scenario: Valid login
    Given the website is open
    When the user enters a valid email
    And the user enters a valid password
    And the user clicks the login button
    Then the dashboard should be displayed
    
     @tag2
     Scenario: Valid login in
     Given user is login with valid email id and password
     
