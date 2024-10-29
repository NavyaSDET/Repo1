Feature: feature to test google search functinality

  Scenario: validate google search is working
    Given brower is open
    And user is on google search page
    When user enters a text in Search box
    And hits enter
    Then user is navigated to search results
