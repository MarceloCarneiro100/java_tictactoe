package br.com.project.tictactoe.core;

import br.com.project.tictactoe.Constants;
import br.com.project.tictactoe.ui.UI;

public class Game {

	Board board = new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];

	public void play() {
		UI.printGameTitle();
		board.print();
		
		// UI.readInput("Nome do Jogador: ");
	}
}
