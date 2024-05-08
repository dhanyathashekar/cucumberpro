Feature: Check Google title

Scenario: Validate the google title
Given open google
When Read title
Then Title should be google