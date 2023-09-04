package sample;

import java.util.List;

public class Game {
	
	private List<Player> list;
	
//	public Game(List<Player> list) {
//		this.list = list;
//	}
//	
	public void setPlayerList(List<Player> list) {
		this.list = list;
	}
	
	public void play() {
		for (Player player : list) {
			player.play();
		}
	}
}
