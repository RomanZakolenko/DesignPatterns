package behavioral.memento;

public class Game {
	private GameState state = new GameState(100, 0);

	public GameState getState(){
		return this.state;
	}
	
	public void play() {
		state = new GameState((int) (this.state.getHealth() * 0.9), this.state.getNumberOfMonsters() + 10);
	}

	public GameMemento saveGame() {
		return new GameMemento(this.state);
	}

	public void loadSave(GameMemento gm) {
		this.state = gm.getState();
	}
}
