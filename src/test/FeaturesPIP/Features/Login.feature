Feature: Login Functionality file

  Background:
    Given I am On the Login Page

  @login
  Scenario: Login with valid credentials
    Given I have entered the right Username and password
    When The user clicks on login button
    And User able to see product heading
    And Add multiple products in the cart
#    And Verify Toast is empty
#    And user click on the add to cart button
#    Then add another product in the cart
    And Verify the Toast count
    And Select price high to low
    And select the value
    Then User able to click the cart icon
    Then verify the price of the item
    Then remove cart item
#    And Verify the Toast count
    And click on checkout
    And add details of checkout
    And click on continue
    And click on finish
    And Validate the order is successfully completed
    And click on logout button
    And Verify the link after logout action
#    And Check XL sheet



#    Scenario: Checkout cart and logout
#      Given click checkout cart button
#      When enter details of checkout
#      And click checkout button
#      Then Logout the application


     # Then Then I should be Logged in successfully

#      Scenario: unsucessfull login with empty or invalid credentials
#        Given I have not entered username or password or entered the invalid email or password
#        When The user clicks on the login button
#        Then User should be able to see the proper error message
#
#
#  Scenario: Forgot pass word functionality
#          Given User clicks on forgot password link
#          Then user should be directed to the password reset page





