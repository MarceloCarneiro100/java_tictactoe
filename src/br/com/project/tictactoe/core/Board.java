package br.com.project.tictactoe.core;

import br.com.project.tictactoe.Constants;
import br.com.project.tictactoe.ui.UI;

public class Board {

	private char[][] matrix = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

	public Board() {
		clear();
	}

	public void clear() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}
	}

	public void print() {

		UI.printNewLine();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				UI.printTextWithNoNewLine(String.valueOf(matrix[i][j]));

				if (j < matrix[i].length - 1) {
					UI.printTextWithNoNewLine(" | ");
				}
			}

			UI.printNewLine();

			if (i < matrix.length - 1) {
				UI.printText("---------");
			}
		}
	}

	public boolean isFull() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean play(Player player, Move move) {
		int i = move.getI();
		int j = move.getJ();

		// TODO validate moves

		matrix[i][j] = player.getSymbol();

		return checkRows(player) || checkCols(player) || checkDiagonalTopLeft(player) || checkDiagonalTopRight(player);
	}

	private boolean checkRows(Player player) {
		for (int i = 0; i < matrix.length; i++) {
			if (checkRow(i, player)) {
				return true;
			}
		}
		return false;
	}

	private boolean checkRow(int row, Player player) {
		char symbol = player.getSymbol();

		for (int j = 0; j < matrix.length; j++) {
			if (matrix[row][j] != symbol) {
				return false;
			}
		}
		return true;
	}

	private boolean checkCols(Player player) {
		for (int j = 0; j < matrix.length; j++) {
			if (checkCol(j, player)) {
				return true;
			}
		}
		return false;
	}

	private boolean checkCol(int col, Player player) {
		char symbol = player.getSymbol();

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][col] != symbol) {
				return false;
			}
		}
		return true;
	}

	private boolean checkDiagonalTopLeft(Player player) {
		char symbol = player.getSymbol();

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] != symbol) {
				return false;
			}
		}
		return true;
	}

	private boolean checkDiagonalTopRight(Player player) {
		char symbol = player.getSymbol();
		int lastRow = matrix.length - 1;

		for (int i = lastRow, j = 0; i >= 0; i--, j++) {
			if (matrix[i][j] != symbol) {
				return false;
			}
		}
		return true;
	}
}
