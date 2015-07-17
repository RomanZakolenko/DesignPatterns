package structural.decorator;

public class Test {
	public static void main(String[] args) {
		RacingCar racingCar = new RacingCar(new PassengerCar());
		racingCar.go();
	}
}
