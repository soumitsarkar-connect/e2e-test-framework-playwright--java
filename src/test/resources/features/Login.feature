@login
Feature: Login page tests

  Background:
    Given I navigate to login page

  @retry
  Scenario: User should be able to login successfully
    When I enter "standard_user" text in input box with "Username" placeholder
    And I enter "secret_sauce" text in input box with "Password" placeholder
    And I click on "Login" button
    Then I should see the "Products" as the page header title
    When I wait for 1 second

