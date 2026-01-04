package br.com.project.tictactoe.core;

@SuppressWarnings("serial")
public class InvalidMoveException extends Exception {

	public InvalidMoveException(String message) {
		super(message);
	}
}
