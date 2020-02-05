#Author: syntax team (tevfikg@gmail.com)
@Spring1
Feature: report

  Background: 
    Given I am logged into HRMS
    And I navigated to Reports Page

  @inProgress
  Scenario: Search for invalid report
    When I enter invalid report
    And I click search button
    Then I see no record found error message
	@smoke
  Scenario: Search for valid report
    When I enter valid report
    And I click search button
    Then I see search report displayed
