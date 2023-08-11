Feature: SignIn Page

Background:
Given User is in SignIn page 
Scenario: User login with empty user name
When user click on Login button with empty username
Then Alert error msg display-Please fill out this field
Scenario: User login with empty password
When user enter username 
And user click on Login button with empty password
Then Then Alert error msg display-Please fill out this field
Scenario: User login-1 with invalid credentials
When user enter invalid username and password
Then Message Dispaly - Invalid username and password
Scenario: User login-2 with invalid credentials
When user enter valid username and Invalid password
Then Message Dispaly - Invalid username and password
Scenario: User login-3 with invalid credentials
When user enter invalid username and invalid password
Then Message Dispaly - Invalid username and password
Scenario: User login with valid credentials
When user enter valid username and valid password
Then user redirected to Home page 
And Display message - You are logged in 