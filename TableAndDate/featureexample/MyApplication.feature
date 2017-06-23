Feature: Facebook smoke test

Scenario Outline: User should login with valid credential
Given  start chorme and go to facebook login page 
When   user enter <username> and <password>
Then   facebook home page displayed

Examples:
          |username|password|
          |mahenkis@gmail|123456|