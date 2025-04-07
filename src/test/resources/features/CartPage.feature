@cart
Feature: Cart Functionality

  Background:
    Given I navigate to login page
    When I login to the app
    And I wait for 1 second
    Then I should see the "Products" as the page header title

  Scenario: Add a single product to the cart and verify cart details
    When I add "Sauce Labs Backpack" product to the cart
    Then I should see cart icon "1" number
    When I click on cart icon
    Then I should see the "Your Cart" as the page header title
    And I should see "Sauce Labs Backpack" text
    And I should see "$29.99" text
    And I should see "Checkout" button
    And I should see button contains "Continue Shopping" text
    When I click on "Remove" button
    Then I should not see cart icon "1" number
    And I click on button contains "Continue Shopping" text
    Then I should see the "Products" as the page header title

  Scenario: Add  multiple product to the cart and verify cart details
    When I add "Sauce Labs Backpack" product to the cart
    And I add "Sauce Labs Bike Light" product to the cart
    And I add "Sauce Labs Bolt T-Shirt" product to the cart
    And I add "Sauce Labs Fleece Jacket" product to the cart
    Then I should see cart icon "4" number