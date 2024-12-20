Feature: Registration
 I want to use this template for my feature file

 
  Background: New user registration page
    Given The user is on the new user registration page
   
Scenario Outline: New user registration page with all fields empty and Register button is clicked
    When The user clicks Register button with all fields empty on registration form from sheetname "<Sheetname>" and row <RowNumber>
    Then The error Please fill out this field appears below Username textbox
    Examples: 
      | Sheetname | RowNumber |
      | register  |         0 | 
    
  Scenario Outline: New user registration page with only username entered
    When The user clicks Register button after entering Username with other fields empty on registration form from sheetname "<Sheetname>" and row <RowNumber>
    Then The error message Please fill out this field. appears below Password textbox
    Examples: 
      | Sheetname | RowNumber |
      | register  |         1 | 
    
   
  Scenario Outline: New user registration page with only username and password fields entered
    When The user clicks Register button after entering Username and password with Password Confirmation field empty on registration form from sheetname "<Sheetname>" and row <RowNumber>
    Then The error message Please fill out this field. appears below Password Confirmation textbox
   Examples: 
      | Sheetname | RowNumber |
      | register  |         2 |
       
  Scenario Outline: New user registration page with username entered with a space inbetween
    When The user clicks Register button after entering a username with spacebar characters other than digits and symbols on registration form from sheetname "<Sheetname>" and row <RowNumber>
    Then The user is displayed with error msg after entering invalid data and redirects to empty username textbox
  Examples: 
      | Sheetname | RowNumber |
      | register  |         3 |   
   
  Scenario Outline: New user registration page with valid username but only numeric password and confirm password
    When The user clicks Register button after entering a password with only numeric data on registration form from sheetname "<Sheetname>" and row <RowNumber>
    Then The user is displayed the appropriate error msg after entering invalid data and redirects to empty confirm password textbox
    Examples: 
      | Sheetname | RowNumber |
      | register  |         4 | 
      
    
  Scenario Outline: New user registration page with valid username but password and confirm password fields has less than eight characters
    When The user clicks Register button after entering a Password with characters less than eight on registration form from sheetname "<Sheetname>" and row <RowNumber>
    Then The user is displayed the appropriate error msg after entering invalid data and  redirects to empty password confirm textbox
    Examples: 
      | Sheetname | RowNumber |
      | register  |         5 | 
    
   
  Scenario Outline: New user registration page on registration with different passwords entered in password and confirm password fields
    When The user clicks Register button after entering different passwords in Password and Password Confirmation fields form from sheetname "<Sheetname>" and row <RowNumber>
    Then The user is displayed with a warning message password_mismatch:The two password fields didn’t match.
   Examples: 
      | Sheetname | RowNumber |
      | register  |         6 |  
   
  Scenario Outline: New user registration page with all valid credentials entered
    When The user clicks Register button after user fills registration form from sheetname "<Sheetname>" and row <RowNumber> 
    Then The user is redirected to Home Page of DS Algo with success message - New Account Created. You are logged in as username on the DS Algo Home Page
     Examples: 
      | Sheetname | RowNumber |
      | register  |         7 | 
      
  Scenario Outline: New user registration page where login button is clicked
    When User clicks on login button from registration page
    Then user lands on login page
    
  Scenario Outline: New user registration page where SignIn button is clicked
    When User clicks on SignIn button from registration page
    Then user lands on login page
    