package behavioral.memento;

public class GameMemento {
	private GameState state;

	public GameMemento(GameState gs) {
		this.state = gs;
	}

	public GameState getState() {
		return this.state;
	}
}
