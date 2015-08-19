package behavioral.state;

public class Registered implements OrderState {
	private Order order;

	public Registered(Order order) {
		this.order = order;
	}

	@Override
	public void register() {
		System.out.println("The order has been registered");
	}

	@Override
	public void invoice() {
		order.setState(new Invoiced(order));
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
		return "Order state: registered";
	}
}
