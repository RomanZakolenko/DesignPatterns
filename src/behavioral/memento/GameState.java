package behavioral.memento;

public class GameState {
	private int health;
	private int numberOfMonsters;

	public GameState(int h, int n) {
		this.health = h;
		this.numberOfMonsters = n;
	}

	public int getHealth() {
		return health;
	}

	public int getNumberOfMonsters() {
		return numberOfMonsters;
	}

	@Override
	public String toString() {
		return "GameState [health=" + health + ", numberOfMonsters=" + numberOfMonsters + "]";
	}
}
