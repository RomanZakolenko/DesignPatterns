package creational.abstractFactory;

public class Test {
	public static void main(String[] args) {
		AbstractFactory factory = new ConcreteFactory1();
		AbstractProductA productA = factory.createProductA();
		AbstractProductB productB = factory.createProductB();
		productA.typeOfProduct();
		productB.typeOfProduct();
		factory = new ConreteFactory2();
		productA = factory.createProductA();
		productB = factory.createProductB();
		productA.typeOfProduct();
		productB.typeOfProduct();
	}
}
