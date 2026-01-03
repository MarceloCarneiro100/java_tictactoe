package br.com.project.tictactoe.core;

public class Move {
	private int i;
	private int j;

	public Move(String moveStr) {
		String[] tokens = moveStr.split(",");
		this.i = Integer.parseInt(tokens[0]);
		this.j = Integer.parseInt(tokens[1]);
		
		//TODO validate if moveStr structure is correct
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
}
