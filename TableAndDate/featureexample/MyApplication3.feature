Feature: Facebook smoke test

Scenario: User should login with valid credential
Given  start chorme and go to facebook login page 
When   user enter usename and password
Then   facebook home page displayed
