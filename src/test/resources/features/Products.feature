@product
Feature: Products page Functionality

  Background:
    Given I navigate to login page
    When I login to the app
    And I wait for 1 second
    Then I should see the "Products" as the page header title

  Scenario: User selects a filter option and verifies product sorting
    When I select "Price (high to low)" from the products sort dropdown
    And I select "Price (low to high)" from the products sort dropdown
    And I select "Name (Z to A)" from the products sort dropdown
    And I select "Name (A to Z)" from the products sort dropdown

  Scenario: Product page text validation
    Then I should see the "Swag Labs" as the page header title