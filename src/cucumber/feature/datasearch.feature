Feature: DataSearch

Scenario: User Searches Verkaufspreis
Given User is on Website5
When User clicked on Webpage Auto suchen
When User Inputs SearchString
Then User clicked on search
Then See result