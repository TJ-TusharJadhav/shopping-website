Feature: Sauce Demo Application Testing

  @tag1
  Scenario: User logs in successfully with valid credentials
    Given I am on the Sauce Demo login page
    When I enter a valid username "standard_user"
    And I enter a valid password "secret_sauce"
    And I click the login button
    Then I should be redirected to the Products page
    And I should see the header "Products"

  @tag2
  Scenario Outline: User fails to log in with invalid credentials
    Given I am on the Sauce Demo login page
    When I enter username "<username>"
    And I enter password "<password>"
    And I click the login button
    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"

    Examples: 
      | username        | password       |
      | invalid_user    | wrong_password |
      | locked_out_user | secret_sauce1  |
@tag3
  Scenario: User adds a product to the cart successfully
    Given I am logged in as "standard_user" with password "secret_sauce"
    And I am on the Products page
    When I click the Add to cart button for the product "sauce-labs-backpack" "sauce-labs-bike-light" 
    Then the cart icon should display a badge with "2"
@tag4
  Scenario: User removes a product from the cart
    Given I have added "sauce-labs-backpack" to the cart
    And I am on the Products page
    When I click the Remove button for the product "sauce-labs-backpack"
    Then the cart icon should not display any badge
@tag5
  Scenario: User completes the checkout process successfully
    Given I have added "sauce-labs-backpack" to the cart
    And I am on the cart page
    When I click the Checkout button
    And I fill in the checkout information with "John" "Doe" "12345"
    And I click the Continue button
    Then I should see the Checkout: Overview page
    When I click the Finish button
    Then I should see the confirmation message "Thank you for your order!"
@tag6
  Scenario: User logs out successfully
    Given I am logged in as "standard_user" "secret_sauce"
    When I click the menu button
    And I click the Logout button
    Then I should be redirected to the login page
