# 🎮 Project: Tic Tac Toe

📖 Portuguese version:  [Here](README.md)

This project implements the classic **Tic Tac Toe** game in Java, with persistent score management stored in a file and a simple text-based interface.

---

## 📂 Project Structure

```
br.com.project.tictactoe
├── Main.java                # Main class that starts the game
├── Constants.java           # Global constants (board size, symbols)
│
├── core/
│   ├── Game.java            # Main game logic
│   ├── Board.java           # Board representation
│   ├── Player.java          # Player representation
│   ├── Move.java            # Move representation
│   └── InvalidMoveException.java # Exception for invalid moves
│
├── score/
│   ├── ScoreManager.java    # Interface for score management
│   └── FileScoreManager.java# Implementation that saves scores to a file
│
└── ui/
    └── UI.java              # Utility class for user interaction
```

---

## 🚀 How to Run

### 🔹 Using an IDE (recommended)
- Import the project into an IDE such as **Eclipse**, **IntelliJ IDEA**, or **VS Code**.
- Configure the project as a Java application.
- Run the `Main.java` class directly from the IDE.

---

## 🕹️ Game Rules

- Two players participate, each with a symbol (`X` or `O`).
- The board is **3x3**.
- Players take turns making moves by entering the position in the format:
  ```
  row,column
  ```
  Example: `0,2` (row 0, column 2).
- The game ends when:
  - A player completes a row, column, or diagonal.
  - The board is full (draw).

---

## 🏆 Score System

- The score is stored in the file `score.txt`.
- Each victory is recorded and accumulated.
- When the game starts, the system informs how many victories each player already has.

---

## 📖 Example Execution

```
=================
| JOGO DA VELHA |
=================

Jogador 1 => Marcelo
O jogador 'Marcelo' vai usar o símbolo 'X'

Jogador 2 => Ana
O jogador 'Ana' vai usar o símbolo 'O'

   |   |   
-----------
   |   |   
-----------
   |   |   

Jogador 'Marcelo' => 0,0
 X |   |   
-----------
   |   |   
-----------
   |   |   

Jogador 'Ana' => 1,1
 X |   |   
----------
   | O |   
----------
   |   |   

Jogador 'Marcelo' => 0,1
 X | X |   
----------
   | O |   
----------
   |   |   

Jogador 'Ana' => 2,2
 X | X |   
----------
   | O |   
----------
   |   | O

Jogador 'Marcelo' => 0,2
 X | X | X
----------
   | O |   
----------
   |   | O

O jogador 'Marcelo' venceu o jogo. 
Fim do jogo!

```

---

## 📌 Technologies Used

- **Java 25 SE**
- File manipulation (`java.nio.file`)
- Data structures (`Map`, `Set`)
- Exception handling

---

## ✨ Possible Future Improvements

- Graphical interface (Swing or JavaFX).
- Boards of different sizes.
- Database persistence.

---