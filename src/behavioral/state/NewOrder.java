package behavioral.state;

public class NewOrder implements OrderState {
	private Order order;

	public NewOrder(Order order) {
		this.order = order;
	}

	@Override
	public void register() {
		order.setState(new Registered(order));
	}

	@Override
	public void invoice() {
		System.out.println("The new order has not yet been registered.");
	}

	@Override
	public void cancel() {
		order.setState(new Cancelled(order));
	}

	@Override
	public boolean addProduct(Product product) {
		return order.getProduct().add(product);
	}

	@Override
	public String toString() {
		return "Order state: new order";
	}
}
