Feature: Like, Flip, Comment, Share and Report on Post

  Background:
    Given user visits login page
    And user Enter username "shamim30453@outlook.com"
    And user Enter password "963147@test"
    Then click on login button


  Scenario Outline: visit home page and share post on Facebook
    Given click on Share icon in home page
    When click on Share on Facebook button
    And user Enter Facebook credentials "<Phone>" and "<FbPassword>"
    And click on Facebook login Button
    Then click on Post To Facebook button
    Examples:
<<<<<<< HEAD
      |    Phone     | FbPassword  |
      | phone number |  password   |
=======
      |   Phone     | FbPassword  |
      | 01647302338 | 30453@shmm  |
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6


  Scenario: visit home page and copy post share link
    Given click on Share icon in home page
    When click on share the link below box and copy the link
    Then verify copied message
    And click on cancel button


  Scenario Outline: user type in search magazines box
    Given click on Flip icon in home page
    Then user enter "<magazine_name>" search magazines box
    Examples:
      | magazine_name |
      |     Test      |


  Scenario Outline: user create magazine
    Given click on Flip icon in home page
    When click on Create Magazine button
    And user enter magazine "<title>" in magazine name box
    And user enter magazine "<description>" magazine description box
    Then click on save button
    Examples:
      |        title       |    description    |
      | The New York Times |  Test description |


  Scenario Outline: user type in comment box
    Given click on Flip icon in home page
    When user enter a "<comment>" in Add a comment box
    Then click on Flip button
    Examples:
      |   comment    |
      | Test comment |


  Scenario: user click on Heart icon
    Given click on Heart icon


  Scenario: user click on Like button
    Given click on The Daily Edition button
    When click on menu button
    Then click on Like button


  Scenario: user click on Flip button
    Given click on The Daily Edition button
    When click on menu button
    Then click on Flip icon


  Scenario: user click on share button
    Given click on The Daily Edition button
    When click on menu button
    Then click on Share icon


  Scenario: user report content
    Given click on The Daily Edition button
    When click on menu button
    And click on report button
    And click on report button in report content
    Then verify reported successfully


  Scenario: user follow The News Desk
    Given click on The Daily Edition button
    Then click on follow button


  Scenario: user visit profile page
    Given click on avatar icon
    When click on profile page
    Then user redirect to profile page and verify page title

