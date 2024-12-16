Feature: Array detail page

  Background: Login and navigate to array page
    Given The user is on the DS Introduction page as signedIn
    When The user clicks on Get Started link for array

  Scenario: Validate user navigated to array details page when clicked on get started
    Then The user is on the array details page

  Scenario: Validate user can navigate to Arrays in python
    Given The user is on the array details page
    When The user click on Array in python link
    Then the user is navigated to array in arrays in python

  Scenario: Validate user can Try here link page from Arrays in python
    Given The user is on the arrays in python page
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for Queue operations
    Given The user is on the arrays in python page
    When User writes invalid code and clicks run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for array in python
    Given The user is on the arrays in python page
    When User clicks on run button with empty code
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for arrays in python runs successfully
    Given The user is on the arrays in python page
    When User writes valid code and clicks run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to Arrays using list
    Given The user is on the array details page
    When The user click on Array using list link
    Then the user is navigated to array in Array using list

  Scenario: Validate user can Try here link page from Array using list
    Given The user is on the Array using list
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for Array using list
    Given The user is on the Array using list
    When User writes invalid code and clicks run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Array using list
    Given The user is on the Array using list
    When User clicks on run button with empty code
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for Array using list runs successfully
    Given The user is on the Array using list
    When User writes valid code and clicks run button
    Then The user should able to see output in the console
    
  Scenario: Validate user can navigate to basic opertaions in lists
    Given The user is on the array details page
    When The user click on basic operations in lists
    Then the user is navigated to basic opertaions in lists

  Scenario: Validate user can Try here link page from Basic operations in lists
    Given The user is on the Basic operations in lists
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for Basic operations in lists
    Given The user is on the Basic operations in lists
    When User writes invalid code and clicks run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for basic operations in lists
    Given The user is on the Basic operations in lists
    When User clicks on run button with empty code
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for basic operations in lists runs successfully
    Given The user is on the Basic operations in lists
    When User writes valid code and clicks run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to applications of array
    Given The user is on the array details page
    When The user click on applications of array link
    Then the user is navigated to applications of array

  Scenario: Validate user can Try here link page from applications of array
    Given The user is on the applications of array
    When User clicks Try here link
    Then User should navigate to tryEditor page

  Scenario: Error message displayed for invalid code on try Editor for applications of array
    Given The user is on the applications of array
    When User writes invalid code and clicks run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for applications of array
    Given The user is on the applications of array
    When User clicks on run button with empty code
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for applications of array runs successfully
    Given The user is on the applications of array
    When User writes valid code and clicks run button
    Then The user should able to see output in the console

  Scenario: validate user able to navigate to practice question page for search the array question
    Given The user is on the practice questions page  
    When the user click on The Search the array link
    Then the user should be redirected to practice question page for search the array
    
  Scenario: validate user able to navigate to practice question page for max consecutive ones question
    Given The user is on the practice questions page  
    When the user click on The Max Consecutive Ones link
    Then the user should be redirected to practice question page for max consecutive ones
    
  Scenario: validate user able to navigate to practice question page for even number question
    Given The user is on the practice questions page  
    When the user click on the even number question link
    Then the user should be redirected to practice question page for even number of digits
    
  Scenario: validate user able to navigate to practice question page for sorted array question
    Given The user is on the practice questions page  
    When the user click on the sorted array link
    Then the user should be redirected to practice question page for sorted array
    
  Scenario: Validate user is able to run the code in tryEditor for Search the array link
    Given The user is on the Practice Questions page of Search array page
    When The user enter python code in tryEditor page sheet "<Sheetname>" and row <RowNumber> for the Question and click on run button
    Then the user should be presented with the Run result from sheet "<Sheetname>" and row <RowNumber>
    Examples: 
    | Sheetname  | RowNumber|
    | pythonCode |  0       |
    
    
  Scenario: Validate user is able to Submit the code in tryEditor for Search the array link
    Given The user is on the Practice Questions page of Search array page
    When The user enter python code in tryEditor page sheet "<Sheetname>" and row <RowNumber> for the Question and click on submit button
    Then the user should be presented with the Run result from sheet "<Sheetname>" and row <RowNumber>
    Examples: 
   | Sheetname  | RowNumber |
   | pythonCode |  1        |
    
 
  Scenario: Validate user is presented with error message for the code with the invalid syntax in tryEditor for search the array link
    Given The user is on the Practice Questions page of Search array page
    When the user click on run button
    Then The user should see an alert error message as "SyntaxError: bad input on line 2"
    
  Scenario: Validate user is able to run the code in tryEditor for Max Consecutive Ones
    Given The user is on the Practice Questions page of Max Consecutive Ones
    When The user enter python code in tryEditor page sheet "<Sheetname>" and row <RowNumber> for the Question and click on run button
    Then the user should be presented with the Run result from sheet "<Sheetname>" and row <RowNumber>
    Examples: 
    | Sheetname  | RowNumber |
    | pythonCode |  2        |
    
    
  Scenario: Validate user is able to Submit the code in tryEditor for Max Consecutive Ones
    Given The user is on the Practice Questions page of Max Consecutive Ones
    When The user enter python code in tryEditor page sheet "<Sheetname>" and row <RowNumber> for the Question and click on submit button
    Then the user should be presented with the Run result from sheet "<Sheetname>" and row <RowNumber>
    Examples: 
    | Sheetname  | RowNumber |
    | pythonCode |  3        |
    
        
  Scenario: Validate user is presented with error message for the code with the invalid syntax in tryEditor for Max Consecutive Ones
    Given The user is on the Practice Questions page of Max Consecutive Ones
    When the user click on run button
    Then The user should see an alert error message as "SyntaxError: bad input on line 2"
  
  Scenario: Validate user is able to run the code in tryEditor for Even number of digits
    Given The user is on the Practice Questions page of Find Numbers with Even Number of Digits
    When The user enter python code in tryEditor page sheet "<Sheetname>" and row <RowNumber> for the Question and click on run button
    Then the user should be presented with the Run result from sheet "<Sheetname>" and row <RowNumber>
    Examples: 
    | Sheetname  | RowNumber |
    | pythonCode |  4        |
    
    
  Scenario: Validate user is able to Submit the code in tryEditor for Even number of digits
    Given The user is on the Practice Questions page of Find Numbers with Even Number of Digits
    When The user enter python code in tryEditor page sheet "<Sheetname>" and row <RowNumber> for the Question and click on submit button
    Then the user should be presented with the Run result from sheet "<Sheetname>" and row <RowNumber>
    Examples: 
    | Sheetname  | RowNumber |
    | pythonCode |  5        |
    
        
  Scenario: Validate user is presented with error message for the code with the invalid syntax in tryEditor for Even number of digits
    Given The user is on the Practice Questions page of Find Numbers with Even Number of Digits
    When the user click on run button 
    Then The user should see an alert error message as "SyntaxError: bad input on line 2"
   
  Scenario: Validate user is able to run the code in tryEditor for Squares of a Sorted Array
    Given The user is on the Practice Questions page of Squares of a Sorted Array
    When The user enter python code in tryEditor page sheet "<Sheetname>" and row <RowNumber> for the Question and click on run button 
    Then the user should be presented with the Run result from sheet "<Sheetname>" and row <RowNumber>
    Examples: 
     | Sheetname  | RowNumber |
    | pythonCode  |  6       |
    
    
  Scenario: Validate user is able to Submit the code in tryEditor for Squares of a Sorted Array
    Given The user is on the Practice Questions page of Squares of a Sorted Array
    When The user enter python code in tryEditor page sheet "<Sheetname>" and row <RowNumber> for the Question and click on submit button
    Then the user should be presented with the Run result from sheet "<Sheetname>" and row <RowNumber>
    Examples: 
   | Sheetname  | RowNumber |
   | pythonCode |  7        |
        
  Scenario: Validate user is presented with error message for the code with the invalid syntax in tryEditor for Squares of a Sorted Array
    Given The user is on the Practice Questions page of Squares of a Sorted Array
    When the user click on run button
    Then The user should see an alert error message as "SyntaxError: bad input on line 2"