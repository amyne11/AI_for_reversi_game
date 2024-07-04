# Reversi Game with AI-Powered Alpha-Beta Pruning

Welcome to the Reversi Game project! This project showcases the power of artificial intelligence by implementing an intelligent game-playing agent for the classic board game Reversi (Othello). The AI utilizes the minimax search algorithm with alpha-beta pruning to play strategically and outsmart its opponents.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Game Rules](#game-rules)
- [AI Development](#ai-development)
- [Testing](#testing)


## Introduction

Reversi is a strategic board game played on an 8x8 grid, where players take turns placing pieces with their color facing up, flipping any of the opponent's pieces that lie between the new piece and another piece of the current player's color. This project aims to create a sophisticated AI agent that can play Reversi with remarkable efficiency using advanced algorithms.

## Features

- Intuitive graphical user interface (GUI) for an engaging gameplay experience.
- Multiple game modes: Human vs. Computer and Computer vs. Computer.
- AI agent implementing the alpha-beta pruning algorithm for intelligent decision-making.
- Debugging and testing tools with ASCII representation of game states.

## Installation

1. Clone this repository to your local machine:
    ```sh
    git clone https://github.com/yourusername/reversi-ai.git](https://github.com/amyne11/AI_for_reversi_game.git
    
    ```

2. Compile the Java source files:
    ```sh
    javac *.java
    ```

## Usage

To start the game, run the following command:
```sh
java Othello
```

### The main game window displays:

- The AI agents controlling the white and black pieces.
- The current board score, indicating the difference between white and black pieces.
- A message indicating the current turn and game instructions.

### Configuring the Game

By default, a human player (Black) competes against a computer agent with random moves (White). To test the AI agent, modify the configuration in `Othello.java`.

### Game Rules

1. The game begins with four pieces in the center of the board in a specific arrangement.
2. Black always moves first.
3. Players must place a piece that brackets one or more of the opponent's pieces in a straight line (horizontally, vertically, or diagonally).
4. Bracketed pieces are flipped to the current player's color.
5. If a player has no legal moves, they must pass their turn.
6. The game concludes when neither player can make a move, and the player with the most pieces on the board wins.

### AI Development

#### Building the AI Agent

- **Board Evaluation Function:** Create a method to assess the value of each board position. This involves assigning strategic values to each square to guide the AI's decisions.
- **Alpha-Beta Pruning:** Implement the minimax algorithm enhanced with alpha-beta pruning to efficiently choose the optimal move based on the board evaluation.

#### Core Classes and Methods

- `BoardState`: Represents the current game state.
- `Move`: Encapsulates the details of a move.
- `MoveChooser`: Abstract class for defining player agents.
- `AlphaBetaMoveChooser`: AI agent utilizing alpha-beta pruning for decision-making.

### Testing

You can test the AI agent by playing games against various player agents. Use the `MoveStats.java` class to collect debug statistics and evaluate the AI's performance.

