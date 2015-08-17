package behavioral.observer;

public class ObserverB implements ObserverInterface {
	private String rate;

	@Override
	public void update(SubjectInterface sub) {
		BoxFight fight = (BoxFight) sub;
		if (fight.getBoxerAScore() > fight.getBoxerBScore()) {
			rate = "BoxerB";
		} else {
			rate = "BoxerA";
		}
	}

	@Override
	public String toString() {
		return "ObserverB" + " [ rate = " + rate + " ] ";
	}
}
