Feature: Graph Data Structure

Scenario: Graph Data Structure
Given user is at Graph page 2 links
When user clicks on Graph link
Then user redirected on Graph Page with TryHere button
Scenario: Graph Assesment Page
Given user is at Graph Page with 3 links 
When user clicks Tryhere button 
And user redirected to Graph Assesment page 
Then user enter Python Code in editor box
And user Click run button 
And user navigate back to Graph page 
Scenario: Graph Representations
Given user is at Graph page 
When user clicks Graph Representations link
Then user redirected to Graph Representations page
Scenario: Graph Representations Assesment
Given user is at Graph Representations page
When user click Tryhere Button on Graph Representations page
Then user redirected to Assesment Page 
Scenario: Navigate -Graph Representation
Given user is at Assesment Page with editor box and run button 
When user enter Python command and click run button 
Then user navigate back to Graph Representations page
Scenario: Practice Questions
Given user is at Graph Representations page with 3 links 
When user clicks Practice Question
And user redirected to Practice Question Page 
Then user navigate back to Graph Representations page
And user select Linked List from DropDown