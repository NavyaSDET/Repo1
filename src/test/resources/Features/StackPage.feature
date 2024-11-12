
Feature: Stack feature
  I want to use this template for my feature file

Scenario: Home Page
 Given  The user is on the DS Algo Home Page
 When The user clicks Get Started button below the Stack
 Then The user should land in "Stack" page

Scenario: Operations in Stack Page
 Given  The user is on the Stack Home Page
 When The user clicks on Operations in Stack link below Topics Covered
 Then The user should land in "Operations in Stack" page


  
Scenario: Stack Operations Try here
 Given  The user is in the Operations in Stack page
 When The user clicks "Try Here" button
 Then The user should be redirected to a page having an tryEditor with a Run button to test
  
Scenario: Stack Operations try here with no code
 Given  The user is in the Operations in Stack page
 When The user clicks the Run Button without entering the code in the Editor
 Then Nothing happens to the page and no error message is displayed
  
Scenario: Stack Operations try here with valid code
 Given  The user is on the tryEditor page
 When The User writes Valid python code
 And click Run button
 Then User is able to see the output in console
  
Scenario: Stack Operations try here with invalid code
 Given  The user is on the tryEditor page
 When the user writes invalid python code
 And click Run button
 Then User is able to see the error msg in pop up window
  
Scenario: Stack  Operations try here error alert
 Given  The user is on the editor page withAlert error message
 When The user click the ok button in the alert window
 Then The user is on the same page having Editor and Run button
  
Scenario: Stack Implementation page
 Given  The user is in the Stack page after logged in
 When The user clicks "Implementation" button
 Then The user should be directed to "Implementation" Page
  
Scenario: Stack Implementation Try here
 Given  The user is in the Implementation page
 When The user clicks "Try Here" button
 Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario: Stack Implementation Try here with no code
 Given  The user is in the Implementation page
 When The user clicks the Run Button without entering the code in the Editor
 Then Nothing happens to the page and no error message is displayed

Scenario: Stack Implementation Try here with valid code
 Given  The user is on the tryEditor page
 When The User writes Valid python code
 And click Run button
 Then User is able to see the output in console
  
Scenario: Stack Implementation Try here with invalid code
 Given  The user is on the tryEditor page
 When the user writes invalid python code
 And click Run button
 Then User is able to see the error msg in pop up window
  
Scenario: Stack Implementation Try here Error Alert
 Given  The user is on the editor page with Alert error message
 When The user click the ok button in the alert window
 Then The user is on the same page having Editor and Run button
  
Scenario: Stack Applications page
 Given  The user is in the Stack page after logged in
 When The user clicks "Applications" button
 Then The user should be directed to "Applications" Page
  
Scenario: Stack Applications Try here
 Given  The user is in the Applications page
 When The user clicks "Try Here" button
 Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario: Stack Applications Try here with no code
 Given  The user is in the Applications page
 When The user clicks the Run Button without entering the code in the Editor
 Then Nothing happens to the page and no error message is displayed
  
Scenario: Stack Applications Try here with valid code
 Given  The user is on the tryEditor page
 When The User writes Valid python code
 And click Run button
 Then User is able to see the output in console
  
Scenario: Stack Applications Try here with invalid code
 Given  The user is on the tryEditor page
 When the user writes invalid python code
 And click Run button
 Then User is able to see the error msg in pop up window
  
Scenario: Stack Applications Try here Error Alert 
 Given  The user is on the editor page with Alert error message
 When The user click the ok button in the alert window
 Then The user is on the same page having Editor and Run button
  
Scenario: Stack Pratice Questions
 Given  The user is in the Stack page after logged in
 When The user clicks "Practice Questions" button
 Then The user should be redirected to "Practice" page
  
