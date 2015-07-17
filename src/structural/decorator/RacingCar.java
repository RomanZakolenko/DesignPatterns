package structural.decorator;

public class RacingCar extends CarDecorator {

	public RacingCar(Car car) {
		super(car);
	}

	@Override
	public void go() {
		this.decoratedCar.go();
		System.out.println(decoratedCar.getType() + " picks up speed.");
	}
}
