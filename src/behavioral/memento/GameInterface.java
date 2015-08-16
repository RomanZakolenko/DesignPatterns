package behavioral.memento;

import java.util.Stack;

public class GameInterface {
	private Game game = new Game();
	private Stack<GameMemento> saves = new Stack<GameMemento>();

	public Game getGame() {
		return this.game;
	}

	public void play() {
		game.play();
	}

	public void f5() {
		saves.push(game.saveGame());
	}

	public void f9() {
		game.loadSave(saves.peek());
	}
}
