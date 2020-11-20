Feature: CSV File comparison test feature file.

  Scenario: Verify consolidated prod and qa data
    When I configure consolidated prod and non prod data files
    And I compare the prod and non prod data