Feature: HomePageFeature

Background:
Given User is in the home page

Scenario: Data structures-Introduction - User clicks Gte Started button 
When The user clicks  Get Started button below the Data structures-Introduction
Then It should alert the user with a message - You are not logged in

Scenario: Array - User clicks Get Started button 
When The user clicks Get Started button below the Array
Then It should alert the user with a message - You are not logged in

Scenario: Select DS without sign-in
When The user selects any data structures item from the drop down without Sign in
Then It should alert the user with a message - You are not logged in

Scenario: User clicks Sign-in
When The user clicks Sign in	
Then The user should be redirected to Sign in page

Scenario: User clicks Register
When The user clicks Register
Then The user should be redirected to Register form