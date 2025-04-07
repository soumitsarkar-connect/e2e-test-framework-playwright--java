@order
Feature: Place order Functionality

  Background:
    Given I navigate to login page
    When I login to the app
    And I wait for 1 second
    Then I should see the "Products" as the page header title

  Scenario: Add a single product to the cart and complete the purchase
    When I add "Sauce Labs Backpack" product to the cart
    And I click on cart icon
    And I click on "Checkout" button
    And I enter "Suman" text in input box with "First Name" placeholder
    And I enter "Das" text in input box with "Last Name" placeholder
    And I enter "721211" text in input box with "Zip/Postal Code" placeholder
    And I click on "Continue" button
    And I click on "Finish" button
    Then I should see "Thank you for your order!" text
    When I click on "Back Home" button
    Then I should see the "Products" as the page header title

  Scenario: Add multiple product to the cart and complete the purchase
    When I add "Sauce Labs Backpack" product to the cart
    And I add "Sauce Labs Bike Light" product to the cart
    And I add "Sauce Labs Bolt T-Shirt" product to the cart
    And I add "Sauce Labs Fleece Jacket" product to the cart
    And I click on cart icon
    And I click on "Checkout" button
    And I enter "Suman" text in input box with "First Name" placeholder
    And I enter "Das" text in input box with "Last Name" placeholder
    And I enter "721211" text in input box with "Zip/Postal Code" placeholder
    And I click on "Continue" button
    And I click on "Finish" button
    Then I should see "Thank you for your order!" text
    When I click on "Back Home" button
    Then I should see the "Products" as the page header title