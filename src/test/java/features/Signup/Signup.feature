Feature: User Registration

  Scenario Outline: user register Successfully with valid credentials
    Given user visits signup page
    When user Enter "<Email>", "<FullName>" and "<Password>"
    Then click on Continue button
    Examples:
<<<<<<< HEAD
      |          Email         |   FullName   |     Password       |
      | scmytest007@gmail.com  | Rahim Hasan  | 78963#jdK@woplj258 |
=======
      |          Email         |   FullName    |     Password       |
      | scmytest007@gmail.com  | Atikur Rahman | 78963#jdK@woplj258 |
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6


  Scenario Outline: user register Successfully with Facebook's valid credentials
    Given user visits signup page
    When click on Facebook icon
    And user Enter Facebook credentials "<Phone>" and "<FbPassword>"
    And click on Facebook login button
    Then signup successfully and validation of page title
    Examples:
<<<<<<< HEAD
      |    Phone     | FbPassword  |
      | phone number |  password   |
=======
      |   Phone     | FbPassword  |
      | 01647302338 | 30453@shmm  |
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6
