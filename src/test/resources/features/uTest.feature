
@stories
Feature uTest
  As a user, I want to register on the uTest platform
  @scenario1
  Scenario: register user
    Given that brandon wants to register on the uTest platform
      | firstName | lastName | email        | birthMonth | birthDay | birthYear |
      | Brandon   | Jonson   | bj@email.com |  6         |   7      | 2001      |
    When he enters his address details on the address registration page
      | city        | postalCode | country  |
      | santa marta | 40007      | Colombia |
    When he enters the data of his mobile devices in the device data registration page
      | yourMobileDevice | model | operatingSystem  |
      |      device      | model | system           |
    Then he enters his password
      | password | confirmPassword |
      | 1234567  | 1234567         |
