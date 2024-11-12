
Feature: Title of your feature
  I want to use this template for my feature file

 Scenario: DS_algo Home page
 Given  The user comes back to the DS_algo home page to select or start DS Graph
 When The user select "Graph" from the Data Structure dropdown menuor clicks the "Get Started" button in Graph Panel
 Then The user should be redirected to "Graph" home page.
  
Scenario: Graph home page
 Given  The user is on the "Graph" home page
 When The user clicks "Graph" link
 Then The user should be redirected to "Graph" page.
  
Scenario: Graph tyr here page
 Given  The user is on the "Graph" page
 When The user clicks "Try Here" button
 Then The user should be redirected to a page having Editor and run button
  
Scenario:  Graph Python Editor page without data
 Given  The user is on the Python Editor
 When The user clicks the Run Button without entering the code in the Editor
 Then Nothing happens to the page and no error message is displayed
  
Scenario:  Graph Python Editor page with valid data
 Given  The user is on the editor page
 When The user writes the valid python code
 And click run button
 Then The user is able to see the output inside the console.
  
Scenario: Graph Python Editor page with invalid data
 Given  The user is on the editor page
 When The user writes the invalid python code
 And click run button
 Then The user see error msg in alert window
  
Scenario: Graph Python Editor page with alert message
 Given  The user is on the editor page with Alert error message
 When The user click the ok button in the alert window
 Then The user is on the same page having Editor and Run button
  
Scenario: Graph Representations page
 Given  The user is on the "Graph" page
 When The user clicks "Graph Representations" link
 Then The user should be redirected to "Graph Representations" page.
  
Scenario: Graph Representations try here page
 Given  The user is on the "Graph Representations" page
 When The user clicks "Try Here" button
 Then The user should be redirected to a page having Editor and run button
  
Scenario: Graph Representations Python Editor page without data
 Given  The user is on the Python Editor
 When The user clicks the Run Button without entering the code in the Editor
 Then Nothing happens to the page and no error message is displayed
  
Scenario: Graph Representations Python Editor page with valid data
 Given  The user is on the editor page
 When The user writes the valid python code
 And click run button
 Then The user is able to see the output inside the console.
  
Scenario: Graph Representations Python Editor page with invalid data
 Given  The user is on the editor page
 When The user writes the invalid python code
 And click run button
 Then The user see error msg in alert window
  
Scenario: Graph Representations Python Editor page with alert message
 Given  The user is on the editor page with Alert error message
 When The user click the ok button in the alert window
 Then The user is on the same page having Editor and Run button
  
Scenario: Graph Practice Questions
 Given  The user is on the "Graph" page
 When The user clicks "Practice Questions" link
 Then The user should be redirected to "Practice Questions" page.
  
Scenario: signing out
 Given  The user is on the DS Algo Home Page
 When The user click the Sign out link
 Then The user able to see successful message :"Logged out successfully"
 And The user should able to see his Register and sign in link on the right side of the DS Algo Introduction Page

Scenario: Close the Browser
 Given  The user is on the DS Algo Introduction Page
 When The user close the browser
 Then Browser should be closed.
  

 