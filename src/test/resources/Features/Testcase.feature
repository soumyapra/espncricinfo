Feature: To validate espncricinfo Application

  @smoke
  Scenario: Validate the Live cricket matches with the Result
Given I am on espncricinfo Application 
When I mousehover on Live scores and click on LiveScoresHome
Then I am able to see Live Cricket Matches text with the Result

