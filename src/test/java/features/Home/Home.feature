Feature: Exploring Flipboard Home Features

  Background:
    Given user visits login page
    And user Enter username "shamim30453@outlook.com"
    And user Enter password "963147@test"
    Then click on login button


  Scenario: check For You href visible
    Given verify For You href visible


  Scenario: visit The Daily Edition page
    Given click on The Daily Edition
    Then user redirect to The Daily Edition page and verify page title

  Scenario: user visit Entertainment page
    Given click on avatar icon
    When click on profile page
    And click on entertainment image
    Then user redirect to entertainment page and verify page title

  Scenario: personalize favorite news topics
    Given click on personalize icon
    When user select favorite topic from list
    Then click on save button
    And  popup close automatically and redirect to home page