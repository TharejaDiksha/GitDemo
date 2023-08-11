Feature: Queue Data Structure
Scenario: Implemention of Queue in python
Given user is at Queue page with 4 Links 
When user click on Implementation of Queue in python
Then user redirected to Implementation of Queue in python page with TryHere button
And user click on Try Here button on Implementation of Queue in python page 
And user redirected to Implementation of Queue in Python Assesment page 
Scenario: Assesment PAge IQP
Given user is at Assesment page with editor box
When user enter Python command in editor box 
Then user click Run button Implementation of Queue
And user navigate back to Implementation of Queue in python page
Scenario: Implementation using collection
Given user is at Implementation of Queue in python page
When user click Implementation using collections.deque
Then user redirected to Implementation using collections.deque page 
And user click TryHere button on Implementation using collections.deque page 
And user redirected to Implementation using collections.deque Assesment page
Scenario:  Assesment ImplUsingCollection
Given user is at Implementation using collection Assesment page with editor box
When user enter Python code in editor box 
Then user click run button of Implementation using collection
Then user navigate back to Implementation using collections.deque page 
Scenario: Implementation using Array 
Given user is at Implementation using collections.deque page 
When user click Implementation using Array 
Then user redirected to Implementation using Array page 
And user click TryHere button Implementation using Array page
And user redirected to Implementation using Array Assesment page
Scenario: Assesment Implementation using Array 
Given user is at Implementation using Array Assesment page with run button
When user enter Python code 
And  user click run button of Implementation using Array
Then user navigate back to Implementation using Array page
Scenario: Queue Operations
Given user is at Implementation using Array page 
When user click Queue Operations
Then user redirected to  Queue Operations page 
And user click Try Here button Queue Operations page 
And user redirected to Queue Operations Assesment page
Scenario: Assesment Queue Operations
Given user is at Queue Operations Assesment page 
When user enter Python command and click run button 
Then user navigate back to Queue Operation page 
Scenario: Practice Question
Given user is at Queue Operation page 
When user click on Practice Question  
Then user redirected to Practice Question page 
Scenario: DataStructure-Graph
Given user is at Practice Question page 
When user navigate back to Queue Operation page after Practice Question 
Then user click dropdown DataStructure and select Garph 
