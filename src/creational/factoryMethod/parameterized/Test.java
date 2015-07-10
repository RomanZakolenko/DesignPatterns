package creational.factoryMethod.parameterized;

public class Test {
	public static void main(String[] args) {
		Creator cr = new Creator();
		cr.factoryMethod("A").printType();
		cr.factoryMethod("B").printType();
	}
}
