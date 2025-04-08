@footer
Feature: Footer Functionality

  Background:
    Given I navigate to login page
    When I login to the app
    And I wait for 1 second
    Then I should see the "Products" as the page header title

  Scenario: Validate All Footer Details
    Then I should see "Twitter" icon
    And I should see "Facebook" icon
    And I should see "LinkedIn" icon
    And I should see "© 2025 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy" text
