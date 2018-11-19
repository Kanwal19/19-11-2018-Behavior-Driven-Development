@tag
Feature: Gmail Login Feature
  Using this feature user can be able to login into gmail account

  @tag1
  Scenario: User wants to login into gmail account
    Given User is on Gmail Home Page
    When User enter username
    And User enter password
    Then Open Gmail account inbox page

