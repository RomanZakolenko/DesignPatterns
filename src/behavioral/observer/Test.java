package behavioral.observer;

public class Test {
	public static void main(String[] args) {
		BoxFight fight = new BoxFight();
		ObserverA obsA = new ObserverA();
		ObserverB obsB = new ObserverB();
		fight.addObserver(obsA);
		fight.addObserver(obsB);
		fight.roundFight();
		System.out.println(obsA + "\n" + obsB);
		fight.roundFight();
		System.out.println(obsA + "\n" + obsB);
		fight.roundFight();
		fight.roundFight();
		fight.roundFight();
		System.out.println(obsA + "\n" + obsB);
	}
}