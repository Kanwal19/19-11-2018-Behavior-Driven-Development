Feature: GitHub Login Feature
  Using this feature user will be able to login into GitHub account

  Scenario: User wants to login into GitHub account
    Given User is on GitHub Login Page
    When User enters username
    And User enters password
    Then Open user's GitHub account Page
    
 	Scenario: User tries to login into GitHub Account using invalid credentials
 		Given User is on GitHub Login Page
 		When User enters invalid username
 		And User enters invalid password
 		Then Show Error Invalid Username/Password       