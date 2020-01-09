Feature: My Demo on tags

@smoke @regression
Scenario: Registration Amazon
Given I launch app
Then I register with valid data
@smok
Scenario: Login in Amazon
Given Application is working
Then I provide valid data
@regression
Scenario: Ordering in Amazon
Given I am placing order for my selected item
@uat @smoke
Scenario: Cancellation in Amazon
Given I cancel the order as it not meets my expectations
