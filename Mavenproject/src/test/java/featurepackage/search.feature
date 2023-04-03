Feature: test scenario to test google search page
Scenario: Search with different set of words
      Given I am on google page "http://google.com/"
      When I search = "selenium "
      And I click on google search button
      Then click on first link