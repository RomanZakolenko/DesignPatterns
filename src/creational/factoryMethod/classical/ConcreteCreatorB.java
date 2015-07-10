package creational.factoryMethod.classical;

public class ConcreteCreatorB extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductB();
	}

}
