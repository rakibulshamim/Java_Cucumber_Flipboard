Feature: User Registration

  Scenario Outline: user register Successfully with valid credentials
    Given user visits signup page
    When user Enter "<Email>", "<FullName>" and "<Password>"
    Then click on Continue button
    Examples:
      |          Email         |   FullName    |     Password       |
      | scmytest007@gmail.com  | Atikur Rahman | 78963#jdK@woplj258 |


  Scenario Outline: user register Successfully with Facebook's valid credentials
    Given user visits signup page
    When click on Facebook icon
    And user Enter Facebook credentials "<Phone>" and "<FbPassword>"
    And click on Facebook login button
    Then signup successfully and validation of page title
    Examples:
      |   Phone     | FbPassword  |
      | 01647302338 | 30453@shmm  |