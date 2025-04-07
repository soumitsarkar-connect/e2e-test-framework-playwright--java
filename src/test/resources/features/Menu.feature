@navMenu
Feature: Menu Functionality

  Background:
    Given I navigate to login page
    When I login to the app
    And I wait for 1 second
    Then I should see the "Products" as the page header title

  Scenario: Validate All Menu Details
    When I click on "Open Menu" button
    And I click on "Close Menu" button
    And I click on "Open Menu" button
    Then I should see "All Items" nav menu text
    And I should see "About" nav menu text
    And I should see "Logout" nav menu text
    And I should see "Reset App State" nav menu text
    When I click on "Close Menu" button
    Then I should see "Open Menu" button