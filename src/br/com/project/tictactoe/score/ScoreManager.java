package br.com.project.tictactoe.score;

import java.io.IOException;

import br.com.project.tictactoe.core.Player;

public interface ScoreManager {
	
	Integer getScore(Player player);

	void saveScore(Player player) throws IOException;
}
