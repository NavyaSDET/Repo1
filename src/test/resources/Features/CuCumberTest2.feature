Feature: Geetha AUtomation Scenarios

Scenario: Validate user lands on default home page
	Given The user should be open the browser
	When The user enter the DS_Algo Portal <URL>
	Then The user should landed on the DS_Algo Get Started page with message You are at the right place


  Scenario: Validate user navigate to DS Intro Page
    Given The user should open the DS Algo Portal URL in any supported browser
    When The user clicks the Get Started button
    Then The user should land in Data Structure Introduction Page with register and Sign in links


  Scenario: Validate the DS dropdown without signIN
    Given The user should open the DS Algo Portal URL in any supported browser
    When The user clicks the Get Started button
    And The user clicks the data structure dropdown arrow
    Then The user should able to see siz options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu


  Scenario: Verify warning message when user navigate to DS details page without signIn
    Given The user is on the DS Introduction page
    When The user clicks any Get Started buttons of data structures on the DS Introduction page
    Then The user should able to see an warning message You are not logged in


  Scenario: Validate user lands on register page when clicked on register
    Given The user is on the DS Introduction page
    When The user clicks Register link on the DS Introduction page
    Then The user should navigate to register page


  Scenario: Clicking on get started for data structers lands on Data Structers details page
    Given The user is on the DS Introduction page as signedIn
    When The user clicks the Get Started button
    Then The user should navigate to DS Intoduction details page .
    And User should see the timeComplexity link


  Scenario: Clicking on time complexity navigate to the page
    Given The user is on the DS Introduction page as signedIn
    When The user clicks the Get Started button
    And The user clicks the Time Complexity button
    Then User should navigate to Time Complexity page
    And User should see Practice Question link and try here


  Scenario: Clicking on Try Here on time complexity opens python editor
    Given The user is on the DS Introduction page as signedIn
    When The user clicks the Get Started button
    And The user clicks the Time Complexity button
    And User clicks Try here link
    Then User should navigate to tryEditor page


  Scenario: Error message displayed for invalid code on try editor for Time Complexity
    Given User is on Try Here page for time complexity
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window


  Scenario: No error message displayed for empty code on try editor for Time Complexity
    Given User is on Try Here page for time complexity
    When Click the Run button
    Then The user should not see any error message or alert


  Scenario: Valid code on try editor for Time Complexity runs successfully
    Given User is on Try Here page for time complexity
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console


  Scenario: Validate user navigated to queue details page when clicked on get started
    Given The user is on the DS Introduction page as signedIn
    When The user clicks on Get started link for Queue
    Then The user is on Queue Details page


  Scenario: Validate user can navigate to Implementations of Queue in Python
    Given The user is on the Queue page
    When The user clicks on Implementation of Queue python link
    Then The user is on the Implimentation of Queue in Python page
    And User is displayed with Try Here


  Scenario: Validate user can open try editor page from Implementation of Queue in python
    Given The user on implementation Queue in python page
    When The user click on Try here button
    Then The user is navigated to Try here page


  Scenario: Error message displayed for invalid code on try editor for Implementation of Queue in python
    Given User is on Try Here page for Implementation of Queue in python
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window


  Scenario: No error message displayed for empty code on try editor for Implementation of Queue in python
    Given User is on Try Here page for Implementation of Queue in python
    When Click the Run button
    Then The user should not see any error message or alert


  Scenario: Valid code on try editor for Implementation of Queue in python runs successfully
    Given User is on Try Here page for Implementation of Queue in python
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console


  Scenario: Validate user can navigate to Implementation using collections.deque
    Given The user is on the Queue page
    When The user click on Implementation using collections.deque link
    Then the user is navigated to Queue in collections.degue


  Scenario: Validate user can open try editor page from Implementation using collections.deque
    Given The user on Implementation using collection.deque in python page
    When The user click on Try here button
    Then The user is navigated to Try here page


  Scenario: Error message displayed for invalid code on try editor for Implementation using collections.deque
    Given User is on Try Here page for Implementation using Qeue in collection.deque
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window


  Scenario: No error message displayed for empty code on try editor for Implementation using collections.deque
    Given User is on Try Here page for Implementation using collection.deque
    When Click the Run button
    Then The user should not see any error message or alert


  Scenario: Valid code on try editor for Implementation using collections.deque runs successfully
    Given User is on Try Here page for Implementation using collection.deque
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console


  Scenario: Validate user can navigate to Implementation Using Array
    Given The user is on the Queue page
    When The user click on Implementation Using Array link
    Then the user is navigated to Queue in Using Array


  Scenario: Validate user can open try editor page from Implementation using Array
    Given The user on Implementation using Array in python page
    When The user click on Try here button
    Then The user is navigated to Try here page


  Scenario: Error message displayed for invalid code on try editor for Implementation using array
    Given User is on Try Here page for Implementation using Queue using Array
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window


  Scenario: No error message displayed for empty code on try editor for Implementation using array
    Given User is on Try Here page for Implementation using array
    When Click the Run button
    Then The user should not see any error message or alert


  Scenario: Valid code on try editor for Implementation using Array runs successfully
    Given User is on Try Here page for Implementation using array
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console


  Scenario: Validate user can navigate to Queue Operations page
    Given The user is on the Queue page
    When The user click onQueue operations link
    Then the user is navigated to Queue in Queue operations


  Scenario: Validate user can open try editor page from Queue operations
    Given The user on Queue operations in python page
    When The user click on Try here button
    Then The user is navigated to Try here page


  Scenario: Error message displayed for invalid code on try Editor for Queue operations
    Given User is on Try Here page for Queue operations
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window


  Scenario: No error message displayed for empty code on try editor for Implementation using array
    Given User is on Try Here page for Queue operations
    When Click the Run button
    Then The user should not see any error message or alert


  Scenario: Valid code on try editor for Queue operations runs successfully
    Given User is on Try Here page for Queue operations
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console


  Scenario: validate user on implementation of queue in python page navigate to practice
    questions page the page is blank
    Given the user is on the implementaion of queue in python
    When the user click on practice question link
    Then The user navigated to blankpage


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

