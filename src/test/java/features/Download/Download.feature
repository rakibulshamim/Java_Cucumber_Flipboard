Feature: Flipboard App Download

  Scenario: Download Flipboard app from Apple App Store
    Given click on Tools button
    And click on Available on iOS button
    Then user redirect to Apple App Store page and validation of page title


  Scenario: Download Flipboard app from Google Play Store
    Given click on Tools button
    And click on Available on Android button
    Then user redirect to Google Play Store page and validation of page title