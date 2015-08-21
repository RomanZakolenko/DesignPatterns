package behavioral.strategy;

public class Test {
	public static void main(String[] args) {
		Myself myself = new Myself();
		myself.walk();
		myself.setWearingStrategy(new RainyWearing());
		myself.walk();
	}
}
