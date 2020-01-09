Feature: TestMeApp validations Demo

  Background: TestMeApp launch and login
    Given User launches the TestMeApp url

  Scenario Outline: Validation for Three users
    Given Application launched  by registered user
    Then User enter the "<username>"
    And User enter the "<password>"
    And clicks on login
    Then User clicks on the All Categories tab
    And User selects the Home Appliances option
    Then User clicks on the Floor option
    Then User clicks on Add to Cart button
    Then User clicks on the Remove cart button

    Examples: 
      | username | password    |
      | Admin    | Password456 |
      | Admin    | Password456 |
      | Admin    | Password456 |
