package behavioral.observer;

public class ObserverA implements ObserverInterface {
	private String rate;

	@Override
	public void update(SubjectInterface sub) {
		BoxFight fight = (BoxFight) sub;
		if (fight.getBoxerAScore() > fight.getBoxerBScore()) {
			rate = "BoxerA";
		} else {
			rate = "BoxerB";
		}
	}

	@Override
	public String toString() {
		return "ObserverA" + " [ rate = " + rate + " ] ";
	}
}
