
Feature: Register page
  
Background:
Given The user opens Register Page

Scenario: User clicks Register Button
When user clicks Register Button
Then   Alert message display at username - Please fill out this field

Scenario: User Register without password
When user enter username
And  user clicks Register Button
Then Alert message dispaly at Password - Please fill out this field

Scenario: User enters different passwords
When user enter username and passwaord
And  user clicks Register Button
Then Alert message display at Password confirm - Please fill out this field

Scenario: User enters invalid password
When user enter invalid password and passd confimation
Then Message should display an error message-password_mismatch-The two password fields didn’t match

Scenario: User enters password with only numbers
When user enter password with only numbers
Then Alert message diplay - check password

Scenario: Correct user registration
When user enter correct username and password
Then user redirected to register homepage
And message display - New Account created.You are logged in as<username>