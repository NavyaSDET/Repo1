
Feature: Title of your feature
  I want to use this template for my feature file

 
  Scenario: DS Algo Sign in Page
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after leaving the "<username>" textbox and "<password>" textbox blank
    Then The error message "Please fill out this field." appears below Username textbox

  
  Scenario: DS Algo Sign in Page
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering the "<username>" and leaves "<password>" textbox blank
    Then The error message "Please fill out this field." appears below Pwd textbox
