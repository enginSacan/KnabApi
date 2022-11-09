@Boards
Feature: Board CRUD actıons can be taken by user as follows:
* Create Board
* Update Board
* Delete Board

  Scenario: Users wants to create a board
    When User creates a board
      | name       |
      | ReThinking |
    Then User should get the board

  Scenario: User wants to update board
    Given User gets created board
    When User updates board description
    Then User should get board with changes

  Scenario: User wants to delete board
    Given User gets created board
    When User deletes board created
    Then User should not get board