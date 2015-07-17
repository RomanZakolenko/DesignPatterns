package structural.decorator;

public class CarDecorator extends Car {
	protected Car decoratedCar;

	public CarDecorator(Car car) {
		this.decoratedCar = car;
	}

	@Override
	public void go() {
		decoratedCar.go();
	}
}
