# BasketBall Game 🏀

This is a Java program that implements the [Observer pattern](https://en.wikipedia.org/wiki/Observer_pattern), which is a behavioral design pattern. It specifies communication between objects(observable) and observers.

## What does the application do?

The implementation is a program that includes a class "Scoring" that keeps track of a basketball game scores and the subscribers (observers) that are subscribed to that scoring class. The Subject class updates the score of a game 4 times (every quarter). The user indicates when the quarter ends through console input.

You initially have 3 subscriber Objects which need to know the updated score after every quarter. The observers (subscribers) are:

- An object that aims to predict final game score.
- An object that is keeping track of all scores.
- An object that generates a news piece title based on the game result.

The program offers a menu to:

- Start a new game (picks 2 random teams and instantiates the Scoring class).
- Simulate 1 quarter ( the scoring class updates scores then notifies subscribers)
- Print the current scores for each quarter.
- Print the current prediction for the final game.
- Print a table of scores of all finished games.
- Generate a news piece title based on result of the last finished game. Example: (("TeamA-name" beat "TeamB-name" by 23 points in a landslide/tightly contested game)).

## Project setup

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them

```
* Java Development Kit from oracle
* Netbeans or Eclipse
```

### Installing

A step by step series of examples that tell you how to get a development env running

1. Open Terminal / Command Prompt and type:

```
git clone https://github.com/vamuigua/BasketBallGame.git
```

<i>or just download the project as a zipped file</i> 🙃

2. Import the Project into Netbeans or Eclipse and then run the main class "BasketBallGame"
3. The program should now be running in the console.

<div align="center">
  <img src="https://media.giphy.com/media/3DrHrnC0JMotPiopno/giphy.gif">
</div>

## Built With

- Java

## Authors

- **Victor Allen** - [vamuigua](https://github.com/vamuigua) :v:

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

- **Geeksforgeeks** - [geeksforgeeks](https://www.geeksforgeeks.org/observer-pattern-set-2-implementation/) 🧑‍💻
