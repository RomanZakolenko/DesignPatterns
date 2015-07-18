package structural.facade;

public class Test {
	public static void main(String[] args) {
		ServiceSystem serviceSystem = new ServiceSystem();
		System.out.println("Order price: " + serviceSystem.checkout(3, 183, 42));
	}
}
