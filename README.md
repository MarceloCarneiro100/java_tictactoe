# 🎮 Projeto: Tic Tac Toe (Jogo da Velha)

📖 English version:  [Here](README.en.md)

Este projeto implementa o clássico **Jogo da Velha** em Java, com gerenciamento de placar persistente em arquivo e interface de texto simples.

---

## 📂 Estrutura do Projeto

```
br.com.project.tictactoe
├── Main.java                # Classe principal que inicia o jogo
├── Constants.java           # Constantes globais (tamanho do tabuleiro, símbolos)
│
├── core/
│   ├── Game.java            # Lógica principal do jogo
│   ├── Board.java           # Representação do tabuleiro
│   ├── Player.java          # Representação de um jogador
│   ├── Move.java            # Representação de uma jogada
│   └── InvalidMoveException.java # Exceção para jogadas inválidas
│
├── score/
│   ├── ScoreManager.java    # Interface para gerenciamento de placar
│   └── FileScoreManager.java# Implementação que salva placar em arquivo
│
└── ui/
    └── UI.java              # Classe utilitária para interação com o usuário
```

---

## 🚀 Como Executar

### 🔹 Usando uma IDE (recomendado)
- Importe o projeto em uma IDE como **Eclipse**, **IntelliJ IDEA** ou **VS Code**.
- Configure o projeto como aplicação Java.
- Execute a classe `Main.java` diretamente pela IDE.

---

## 🕹️ Regras do Jogo

- Dois jogadores participam, cada um com um símbolo (`X` ou `O`).
- O tabuleiro é **3x3**.
- Os jogadores alternam suas jogadas informando a posição no formato:
  ```
  linha,coluna
  ```
  Exemplo: `0,2` (linha 0, coluna 2).
- O jogo termina quando:
  - Um jogador completa uma linha, coluna ou diagonal.
  - O tabuleiro fica cheio (empate).

---

## 🏆 Sistema de Placar

- O placar é armazenado no arquivo `score.txt`.
- Cada vitória é registrada e acumulada.
- Ao iniciar o jogo, o sistema informa quantas vitórias cada jogador já possui.

---

## 📖 Exemplo de Execução

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

## 📌 Tecnologias Utilizadas

- **Java 25 SE**
- Manipulação de arquivos (`java.nio.file`)
- Estruturas de dados (`Map`, `Set`)
- Tratamento de exceções

---

## ✨ Possíveis Melhorias Futuras

- Interface gráfica (Swing ou JavaFX).
- Tabuleiros de tamanhos diferentes.
- Persistência em banco de dados.

---
