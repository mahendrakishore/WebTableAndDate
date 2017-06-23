Feature: Facebook smoke test

Scenario: User should login with valid credential
Given  start chorme and go to facebook login page 
When   user enter "mahenkis@gmail.com" and "123456"
Then   facebook home page displayed
