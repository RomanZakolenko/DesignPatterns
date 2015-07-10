package creational.factoryMethod.parameterized;

public class Creator {
	public Product factoryMethod(String type) {
		switch (type) {
		case "A":
			return new ConcreteProductA();
		case "B":
			return new ConcreteProductB();
		default:
			return new ConcreteProductA();
		}
	}
}
