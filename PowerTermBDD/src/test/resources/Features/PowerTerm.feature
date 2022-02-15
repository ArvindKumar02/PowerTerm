@PT
Feature: Feature to Automate PowerTerm

  @PT1
  Scenario: Open PowerTerm Tool
    Given user launchs Application
    When user enters <HostName> and <TerminalName>
    Then user is navigated to Working Page
    
    Examples:
    |HostName|TerminalName|
    |KMBL|KOTAK|
    
    @PT2
    Scenario: Close the Connect
    Given user closess the connect Window
    And user is navigated to working Space
    Then user closes the Application
    
