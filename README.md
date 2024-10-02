# :black_joker: WELCOME TO SNAP GAME 

The objective of this project was to create an interactive terminal based snap card game using JAVA and to showcase my understanding on the module.

The built follows instructions provided by _nology with slight adjustments:
* Instead of generating the card deck when cardGame is instantiated, the method is called when DealCard is called.
  This is done to make sure that when the deck is empty, a new one is generated.
  The above also enabled me to make this class abstract.
* There are additional methods created in snap class to take care of some conditions that are listed below.

## GAME STRUCTURE
* The game starts with a set of basic instructions.
* Asks for player names
* Deals card when "ENTER" is pressed
* waits for 2 seconds (type snap if symbol matches to the previous one)
* If snap!, a restart message will appear
    * Press 'y' to continue
    * Press 'n' to end the game.

_P.S. Since this is a terminal based game, you will have to clone the repo and run it in your IDE to play the game._

Enjoy!

## :white_check_mark: Conditions taken into consideration
* Cannot:
  * Submit empty string as Player name
  * Continue the game until "Enter" is pressed.
  * Continue the game if a string is entered
* Player name always displayed in **Capitalised** case
* After a card is dealt and if symbol matches the previous one:
  * Game is won if user types snap within 2 secs
  * Print a message if the user misses a snap
  * Do not take any value except snap or Enter
* After a card is dealt and if symbol does not match the previous one
  * Print appropriate message
* Give an option to restart the game.
  * Does not take any values except 'y' or 'n'
  * If y, start the game again
  * If n, print an appropriate message and terminate the program
  
## :negative_squared_cross_mark: Features Pending
* Allow multiple players to play the game. (Currently hard-coded to play with 2 players)
* Test units - No test cases have been written. (Currently only manual testing has been done by running the application with multiple different values)
  
