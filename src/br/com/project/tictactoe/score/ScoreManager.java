package br.com.project.tictactoe.score;

import br.com.project.tictactoe.core.Player;

public interface ScoreManager {
	
	Integer getScore(Player player);

	void saveScore(Player player);
}
