Feature: Login Feature
  I want to use this template for my feature file
  
Scenario: DS Algo Sign in Page with blank info
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after leaving the username textbox and paswword textbox blank from sheetname "<Sheetname>" and row <rownumber>
 Then The error message "Please fill out this field." appears below Username textbox
  Examples: 
      | Sheetname | rownumber  |
      | Login     | 3          |
      
 Scenario: DS Algo Sign in Page with blank password
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after entering only username from sheetname "<Sheetname>" and row <rownumber>
 Then The error message "Please fill out this field." appears below Pwd textbox
  Examples: 
      | Sheetname | rownumber  |
      | Login     | 6          |
      
Scenario: DS Algo Sign in Page  with blank username
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after entering only password from sheetname "<Sheetname>" and row <rownumber>
 Then The error message "Please fill out this field." appears below Username textbox
  Examples: 
      | Sheetname | rownumber  |
      | Login     | 6          |
 
Scenario: DS Algo Sign in Page with invalid username and password
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after entering invalid username and invalid password from sheetname "<Sheetname>" and row <rownumber>
 Then The user should able to see an error message "Invalid Username and Password".
  Examples: 
      | Sheetname | rownumber  |
      |Login      |   4        |
      
Scenario: DS Algo Sign in Page with valid username and invalid password
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after entering valid userName and invalid password from sheetname "<Sheetname>" and row <rownumber>
 Then The user should able to see an error message "Invalid Username and Password".
  Examples: 
      | Sheetname | rownumber  |
      |Login      |     7      |
      
Scenario: DS Algo Sign in Page  with valid username and Valid password
 Given  The user is on the DS Algo Sign in Page
 When The user clicks login button after entering valid userName and password from sheetname "<Sheetname>" and row <rownumber>
 Then user lands on the home page as signedIn
  Examples: 
      | Sheetname | rownumber  |
      |Login      |    6       |
