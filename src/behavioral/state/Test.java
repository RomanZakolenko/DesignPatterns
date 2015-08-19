package behavioral.state;

public class Test {
	public static void main(String[] args) {
		Order order = new Order();
		order.addProduct(new Product("Milk", "0.5$"));
		System.out.println(order);
		order.invoice();
		order.register();
		System.out.println(order);
		order.addProduct(new Product("Cake", "0.3$"));
		System.out.println(order);
		order.cancel();
		System.out.println(order);
		order.register();
		order.invoice();
		order.cancel();
	}
}
