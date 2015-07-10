package creational.factoryMethod.classical;

public class Test {
	public static void main(String[] args) {
		Creator[] cr = { new ConcreteCreatorA(), new ConcreteCreatorB() };
		for (Creator c : cr) {
			c.factoryMethod().printType();
		}
	}
}
