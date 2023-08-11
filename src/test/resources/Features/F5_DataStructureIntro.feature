Feature: DataStructure-Introduction 

Scenario: Get Started Button 
Given User is at Home Page
When user click Get Started Button below DataStructure-Introduction 
Then user is at DataStructure-Introduction Page 

 
Scenario: Time Complexity Page 
Given user is at DataStructure-Introduction Page with 2 links
When user click Time Complexity Button 
Then user redirected to Time Complexity Of DataStructure-Introduction 

Scenario: Practice Question Page
Given user is at Time Complexity page 
When user click Practice Question button 
Then user Redirected to Practice Question page 
And user navigate back to Time Complexity page 

Scenario: Assesment Page 
Given user is at Time Complexity page 
When user click on Try Here Button 
Then user redirected to Assesment page with Run Button to test
And user navigate back to Data Structure Home page