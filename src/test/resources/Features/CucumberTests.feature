#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: CuCumber Tests

  Scenario: Browser page
Given: The user should be open the browser
When: The user enter the DS_Algo Portal <URL>
Then: The user should landed on the DS_Algo Get Started page with message "You are at the right place"

Scenario: Browser page
Given: The user should open the DS Algo Portal URL in any supported browser
When: The user clicks the Get Started button
Then: The user should land in Data Structure Introduction Page with register and Sign in links

Scenario: Browser page
Given: The user should open the DS Algo Portal URL in any supported browser
When: The user clicks the data structure dropdown arrow
Then: The user should able to see 6 options Arrays "Linked,List,Stack,Queue,Tree,Graph" in dropdown menu

Scenario: Browser page
Given: The user is on the DS Introduction page
When: The user selects any data structures item from the drop down without Sign in.
Then: The user should able to see an warning message You are not logged in

Scenario: DS Introduction page
Given: The user is on the DS Introduction page
When: The user clicks any Get Started buttons of data structures on the DS Introduction page
Then: The user should able to see an warning message You are not logged in

Scenario: DS Introduction page
Given: The user is on the DS Introduction page
When: The user clicks Register link on the DS Introduction page
Then: The user should able to see an warning message You are not logged in
And: The user should able see message Login at the bottom of the page

Scenario: Array
Given: The user is on the Array page
When: The user clicks a Arrays in Python link
Then: The user should be redirected to "Array in Python " Page

Scenario: Array in Python Page
Given: The user is on the Array in Python Page
When: The user clicks Try Here button of Array in Python Page
Then: The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the invalid code in Editor
Then: Nothing happens to the page and no error message is displayed

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the invalid code in Editor
And: Click the Run Button
Then: The user should able to see an error message in alert window

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Run Button
Then: The user should able to see output in the console

Scenario: Array in Python Page
Given: The user is on the Array in Python page
When: The user clicks a Arrays Using List link
Then: The user should be redirected to "Array Using List" page.

Scenario:  validating array phyton page 
Given The USER is on the Array in Python page 
When: The user clicks Try Here button of Array Using List Page
Then: The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user clicks the Run Button without entring the code in the Editor
Then: Nothing happens to the page and no error message is displayed

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the invalid code in Editor
And: Click the Run Button
Then: The user should able to see an error message in alert window

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Run Button
Then: The user should able to see output in the console

Scenario: Array Using List Page
Given: The user is on the Array in Using List page
When: The user clicks a Basic Operations in Lists link
Then: The user should be redirected to "Basic Operations in Lists" BO page.

Scenario: Basic operations in Lists page
Given: The user is on the Basic Operations in Lists page
When: The user clicks Try Here button of Operations in Lists
Then: The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user clicks the Run Button without entring the code in the Editor
Then: Nothing happens to the page and no error message is displayed

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the invalid code in Editor
And: Click the Run Button
Then: The user should able to see an error message in alert window

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Run Button
Then: The user should able to see output in the console

Scenario: Basic operations in Lists page
Given: The user is on the Basic Operations in Lists page
When: The user clicks an Applications of Array link
Then: The user should be redirected to " Applications of Array" AA page.

Scenario: Application of Array page
Given: The user is on the Applications of Array page
When: The user clicks Try Here button of Application of Array page
Then: The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user clicks the Run Button without entring the code in the Editor
Then: Nothing happens to the page and no error message is displayed

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the invalid code in Editor
And: Click the Run Button
Then: The user should able to see an error message in alert window

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Run Button
Then: The user should able to see output in the console

Scenario: Application of Array page
Given: The user is on the Applications of Array page
When: The user clicks Practice Questions link
Then: The user should be redirected to practice page having links like "Search the array." ,"Max Consecutive Ones","Find Numbers with Even Number of Digits" and "Squares of a Sorted Array."

Scenario: Practice Questions page
Given: The user is on Practice page
When: The user clicks search the array link
Then: The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user clicks the Run Button without entring the code in the Editor
Then: Nothing happens to the page and no error message is displayed

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the invalid code in Editor
And: Click the Run Button
Then: The user should able to see an error message in alert window

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Run Button
Then: The user should able to see output in the console

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Submit Button
Then: The user see an error message "Error occurred during submission"

Scenario: Practice Questions page
Given: The user is on Practice page
When: The user clicks Max consecutive ones link
Then: The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user clicks the Run Button without entring the code in the Editor
Then: Nothing happens to the page and no error message is displayed

Scenario: 
Given: The user is on the Python Editor
When: The user write the invalid code in Editor
And: Click the Run Button
Then: The user should able to see an error message in alert window

Scenario: 
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Run Button
Then: The user should able to see output in the console

Scenario: 
Given: The user is on the Python Editor
When: The user clicks Find numbers with even number of digits link
And: Click the Submit Button
Then: The user see an error message "Error occurred during submission"

Scenario: Python Editor
Given: The user is on Practice page
When: The user clicks the Run Button without entring the code in the Editor
Then: The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the invalid code in Editor
Then: Nothing happens to the page and no error message is displayed

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Run Button
Then: The user should able to see an error message in alert window

Scenario: Practice Questions page
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Run Button
Then: The user should able to see output in the console

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user clicks squared of the sorted array link
And: Click the Submit Button
Then: The user see an error message "Error occurred during submission"

Scenario: Practice Questions page
Given: The user is on Practice page
When: 
Then: The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user clicks the Run Button without entring the code in the Editor
Then: Nothing happens to the page and no error message is displayed

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the invalid code in Editor
And: Click the Run Button
Then: The user should able to see an error message in alert window

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Run Button
Then: The user should able to see output in the console

Scenario: Python Editor
Given: The user is on the Python Editor
When: The user write the valid code in Editor
And: Click the Submit Button
Then: The user see an error message "Error occurred during submission"

Scenario: Queue
Given: The user is on the tryEditor page
When: the user writes invalid python code
And: click Run button
Then: User is able to see the error msg in pop up window

Scenario: Queue
Given: The user is on the editor page with Alert error message
When: The user click the ok button in the alert window
Then: The user is on the same page having Editor and Run button

Scenario: Queue
Given: The user is in the Queue page after logged in
When: The user clicks "Implementation using Array" button
Then: The user should be directed to "Implementation using Array" Page

Scenario: Queue
Given: The user is in the Implementation using Array page
When: The user clicks "Try Here" button
Then: The user should be redirected to a page having an tryEditor with a Run button to test

Scenario: Queue
Given: The user is on the tryEditor page
When: The User writes Valid python code
And: click Run button
Then: User is able to see the output in console

Scenario: Queue
Given: The user is on the tryEditor page
When: the user writes invalid python code
And: click Run button
Then: User is able to see the error msg in pop up window

Scenario: Queue
Given: The user is on the editor page with Alert error message
When: The user click the ok button in the alert window
Then: The user is on the same page having Editor and Run button

Scenario: Queue
Given: The user is in the Queue page after logged in
When: The user clicks "Queue Operations" button
Then: The user should be directed to "Queue Operations" Page

Scenario: Queue
Given: The user is in the Queue Operations page
When: The user clicks "Try Here" button
Then: The user should be redirected to a page having an tryEditor with a Run button to test

Scenario: Queue
Given: The user is on the tryEditor page
When: The User writes Valid python code
And: click Run button
Then: User is able to see the output in console

Scenario: Queue
Given: The user is on the tryEditor page
When: the user writes invalid python code
And: click Run button
Then: User is able to see the error msg in pop up window

Scenario: Queue
Given: The user is on the editor page with Alert error message
When: The user click the ok button in the alert window
Then: The user is on the same page having Editor and Run button

Scenario: Queue
Given: The user is in the Queue page
When: The user clicks "Practice Questions" button
Then: The user should be redirected to "Practice" page