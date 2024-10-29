

#author 
#Date 
#description
Feature: feature to text login functanalit


  Scenario: Check login is successful with valid credentials
    Given user is on the login page
    When user enters username and password
    And clicks on the login button
    Then user is navigated to the home page

 