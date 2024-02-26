Feature: N11 Test Scenarios


  Background: Navigate to Url
    Given Navigate to "n11Url"

  Scenario: Login with Facebook
    When Navigate to login page
    When Log in with facebook
    Then Verify successful login







