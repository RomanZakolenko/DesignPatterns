package behavioral.observer;

import java.util.List;
import java.util.ArrayList;

public class BoxFight implements SubjectInterface {
	private List<ObserverInterface> observers = new ArrayList<ObserverInterface>();
	private int roundNumber;
	private int boxerAScore;
	private int boxerBScore;

	public int getBoxerAScore() {
		return boxerAScore;
	}

	public int getBoxerBScore() {
		return boxerBScore;
	}

	@Override
	public void addObserver(ObserverInterface obs) {
		observers.add(obs);
	}

	@Override
	public void removeObserver(ObserverInterface obs) {
		observers.remove(obs);
	}

	@Override
	public void update() {
		for (ObserverInterface o : observers) {
			o.update(this);
		}
	}

	public void roundFight() {
		this.roundNumber++;
		this.boxerAScore += Math.random() * 10;
		this.boxerBScore += Math.random() * 10;
		update();
	}
}
