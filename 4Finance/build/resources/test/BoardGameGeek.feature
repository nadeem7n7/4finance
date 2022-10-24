Feature: An acceptance test for BoardGameGeek service

  Scenario: Game collection of a user and information about the game


Given I Open the game collection of a user (any user, there is no need to create one).

And Go to the page of one of the games (chosen at random).

Then API Check the information about the game - look for poll results about Language Dependence.

Then Verify that the most voted Language Dependence level is presented on the game's page.