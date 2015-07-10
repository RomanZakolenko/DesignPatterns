package creational.factoryMethod.classical;

public class ConcreteCreatorA extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}

}
