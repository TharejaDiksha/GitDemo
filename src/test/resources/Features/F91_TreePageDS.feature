Feature: Tree-Data Structure 
Scenario: Tree Page 
Given user is at Tree page with 13 links
When user clicks on Overview Of Tree
Then user redirected to Overview Of Tree page
Scenario: Overview of Page
Given user is at Overview Of Tree page with TRyHere button 
When user clicks Tryhere button on Overview Of Tree page
Then user redirected to Overview Of Tree Assesment page
And user enters Python code and click Runbutton
And user navigate back to Overview Of Tree page
Scenario: Types of Tree
Given user is at Overview Of Tree page
When user click on Types of Trees
Then user redirected to Types of Trees page 
Scenario: Types of Trees page
Given user is at Types of Trees page with tryhere button
When user click Tryhere Button Types of Trees page
Then user redirected to Types of Trees Assesment page
Scenario: Types of Trees Assesment page
Given user is at Types of Trees Assesment page with TryHere button
When user clicks Tryhere at Types of Trees page
Then user redirected to TypesTree Assesment page
And user enter Python command 
And user navigate back to  Types of Trees page
Scenario: Select Array from Dropdown
Given user is at Types of Trees page 
When user navigate back to Types of Trees page
Then user click Array from Dropdown