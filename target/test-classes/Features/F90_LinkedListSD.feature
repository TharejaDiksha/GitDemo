Feature:  Linked List - Data Structure

Scenario:  Linked list page
Given user is at Linked List page with 7 links
When user 	clicks on Introduction 
Then user redirected to Introduction page with 8 links 
Scenario: Introduction page
Given user is at Introduction page with TryHere button
When user clicks on TryHere button on Introduction page
Then user redirected to Introduction Assesment page 
Scenario: Introduction Assesment page
Given user is at Introduction Assesment page with run button
When user enter python command in Editor box
And submit run button 
Then user navigate back to Introduction page
Scenario: Creating Linked List page 
Given user is at Introduction page 
When user click Creating Linked List 
Then user redirected to Creating Linked List page 
Scenario: Creating Linked List Assesment page
Given user is at Creating Linked List page with TryHere button 
When user enter python command in Editor box with run
And submit run button 
Then user navigate back to Creating Linked List page
Scenario: Deletion page 
Given user is at Creating Linked List page
When user clicks at Deletion 
Then user redirected to Deletion page 
Scenario: Deletion Assesment page 
Given user is at Deletion page with Tryhere button
When user redirected to Assesment page with run button
And user enter Python code in editor box and click run button 
Then user naviagte back to Deletion page
Scenario: Practice Question page
Given user is at Deletion page 
When user clicks Practice Questions 
Then user redirected to Practice Questions page
And user navigate back to Deletion page 
And user select Tree from DropDown

