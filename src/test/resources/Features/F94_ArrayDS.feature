Feature: Array page
  
Scenario: Array in Python link 
Given user is at Array page with 4 links
When user click on Arrays in Python in Array 
Then user is redirected to Arrays in Python page

Scenario:  Array in Python Assesment page
Given user is at Arrays in Python Page 
When user click on Try Here Button on Array in Python page 
And user redirected to Assesment Page with Editor text box 
Then user enter Python Code and Click run Button 
And user navigate back to Array in Python

Scenario: Array using List Page
Given user is at Array in Python page with 5 links
When user click on Arrays using List in Array page
Then user is redirected to Arrays using List page

Scenario:  Array using List Assesment page
Given user is at Arrays using List Page 
When user click on Try Here Button in Array using List page
Then user navigate to Array using List Assesment Page 
And user enter Python Code in Array using list and Click run Button 
And user navigate back to Array using List

Scenario: Array-Basic Operations in List
Given user is at Array using List
When user click on Basic Operations in List in array page
Then user is at Basic Operations in List page

Scenario:  Basic Operations in List Assesment Page
Given user is at Basic Operations in List Page 
When user click on Try Here Button -Basic operation 
And user navigate to Assesment Page with run button 
Then user enter Python Code and Click run Button 
And user is at Basic Operations in List page with 5 links

Scenario: Practice Question in Array APge
Given user is at Basic Operations list
When user click on Practice Question
Then user is at Practice Question page with 4 links

Scenario: Search the Array in  Practice Question
Given user is at Practice Question 
When user click on Search the array
And user redirected to Assesment page of SearchArray with Run and Submit button
Then user enters Python code in Search Array and click run and submit button
And user redirected to Practice Question

Scenario: Max Consecutive Ones
Given user is at Practice Question with MaxCO
When user click on Max Consecutive Ones
Then user is at Assesment page in MaxCO with Editor Text box with Run and Submit button
And user enters Python code in MaxCO and run and click submit button
And user click Signout  button








  