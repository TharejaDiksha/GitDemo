Feature: Stack Page

Scenario:Home Page Stack
Given user is at home page with 7 link
When user clicks Getting Started Button under Stack 
Then user redirected to Stack page
Scenario:Operation in Stack
Given user is at Stack Page 
When user clicks Operations in Stack button 
Then user redirected to Operation in Stack page 
And user clicks Try Here button on Operation in Stack page and redirected to Assesment page
Scenario:Operation in stack- EditorBox
Given user is on Assessment page with Editor box and run button 
When user enter Python Code in Editor box
And user enter  run button
Then user navigate back to Operations in Stack 
Scenario:Implementation Page 
Given user is in Operation in Stack with 4 links
When user clicks on Implementation 
Then user redirected to Implementation page withn Try here button
And user clicks Try here button on Implementation page   
Scenario:Implementaion Page-Editor Box
Given user is on Assessment page with Editor box 
When user enter Python Code in Editor box and enter Run Button
Then user navigate back to Implementaion page 
Scenario:Application Page
Given user is in Implementaion page
When user clicks on Aplications 
Then user redirected to Application Page with Try here button
And user clicks TryHere button on Application page 
Scenario:Application Page-EditorBox
Given user is on Assessment page 
When user enter Python Code and click Run Button
Then user navigate back to Application page
Scenario:Stack Practice Questions
Given user is on Application page
When user click Practice Question
Then user is at Practice Question Page 
And user navigate back to Home Page-Numpy Ninja 