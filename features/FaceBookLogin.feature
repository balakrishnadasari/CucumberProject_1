Feature: Test FaceBook Smoke Scenario
  
  Scenario: Test Login with valid credentials
  
    Given open firefox and start application
    When I enter valid username and password
    Then user should be able to login successfully

  