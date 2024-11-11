  Feature: Array detail page

  Scenario: Validate user navigated to array details page when clicked on get started
    Given The user is on the DS Introduction home page
    When The user clicks on Get Started link for array
    Then The user is on the array details page

  Scenario: Validate user can navigate to Arrays in python
    Given The user is on the Array page
    When The user click on Array in python link
    Then the user is navigated to array in arrays in python

  Scenario: Validate user can Try here link page from Arrays in python
    Given The user is on the arrays in python page
    When The user click on Try here button
    Then The user is navigated to Try here page

  Scenario: Error message displayed for invalid code on try Editor for Queue operations
    Given User is on Try Here page for arrays in python
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for array in python
    Given User is on Try Here page for arrays in python
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for arrays in python runs successfully
    Given User is on Try Here page for arrays in python
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to Arrays using list
    Given The user is on the Array page
    When The user click on Array using list link
    Then the user is navigated to array in Array using list

  Scenario: Validate user can Try here link page from Array using list
    Given The user is on the Array using list
    When The user click on Try here button
    Then The user is navigated to Try here page

  Scenario: Error message displayed for invalid code on try Editor for Array using list
    Given User is on Try Here page for Array using list
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for Array using list
    Given User is on Try Here page for Array using list
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for Array using list runs successfully
    Given User is on Try Here page for Array using list
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to basic opertaions in lists
    Given The user is on the arryas page
    When The user click on basic operations in lists
    Then the user is navigated to basic opertaions in lists

  Scenario: Validate user can Try here link page from Basic operations in lists
    Given The user is on the Basic operations in lists
    When The user click on Try here button
    Then The user is navigated to Try here page

  Scenario: Error message displayed for invalid code on try Editor for Basic operations in lists
    Given User is on Try Here page for Basic operations in lists
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for basic operations in lists
    Given User is on Try Here page for Basic operations in lists
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for basic operations in lists runs successfully
    Given User is on Try Here page for Basic operations in lists
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: Validate user can navigate to applications of array
    Given The user is on the arryas page
    When The user click on applications of array link
    Then the user is navigated to applications of array

  Scenario: Validate user can Try here link page from applications of array
    Given The user is on the applications of array
    When The user click on Try here button
    Then The user is navigated to Try here page

  Scenario: Error message displayed for invalid code on try Editor for applications of array
    Given User is on Try Here page for applications of array
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window

  Scenario: No error message displayed for empty code on try editor for applications of array
    Given User is on Try Here page for applications of array
    When Click the Run button
    Then The user should not see any error message or alert

  Scenario: Valid code on try editor for applications of array runs successfully
    Given User is on Try Here page for applications of array
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console

  Scenario: validate user can click on practicequestions
    Given the user is on the applications of arrays page
    When the user click on the practice questions link
    Then the user navigates to practice question page
