package behavioral.state;

public class Invoiced implements OrderState {
	private Order order;

	public Invoiced(Order order) {
		this.order = order;
	}

	@Override
	public void register() {
		System.out.println("The order can not be registered as invoiced.");
	}

	@Override
	public void invoice() {
		System.out.println("The order has beed invoiced.");
	}

	@Override
	public void cancel() {
		System.out.println("The order can not be cancelled as invoiced.");
	}

	@Override
	public boolean addProduct(Product product) {
		return false;
	}

	@Override
	public String toString() {
		return "Order state: invoiced";
	}
}
