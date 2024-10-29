Feature: Queue Details page

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
