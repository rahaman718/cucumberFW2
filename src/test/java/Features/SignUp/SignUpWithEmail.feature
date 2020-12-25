Feature: Sign Up

  Scenario: Sign Up With valid Email address
    Given That I am on TalentTek home page
    When we fill the form with valid email address
    And I click on the Create my Account Button
    Then I verify that I successfully signed up


  Scenario: Sign Up without password
    Given That I am on TalentTek home page
    When we fill the form without password
    And I click on the Create my Account Button
    Then I verify that I wasn't successfully signed up