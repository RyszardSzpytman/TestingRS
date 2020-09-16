Feature: Add address data to user account

  Scenario Outline: Register new user and update address
    Given open mystore with google
    When sign in user
    And user go to address section
    And fill the address form <address>, <city>, <zip>, <country>
    Then check address
    And close browser

    Examples:
    |address|city|zip|country|
    |Polna 12|Warszawa|00-000|United Kingdom|