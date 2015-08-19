package behavioral.state;

public class Cancelled implements OrderState {
	private Order order;

	public Cancelled(Order order) {
		this.order = order;
	}

	@Override
	public void register() {
		System.out.println("The order can not be registered as canceled.");
	}

	@Override
	public void invoice() {
		System.out.println("The order can not be invoiced as canceled.");
	}

	@Override
	public void cancel() {
		System.out.println("The order has been canceled.");
	}

	@Override
	public boolean addProduct(Product product) {
		return false;
	}

	@Override
	public String toString() {
		return "Order state: cancelled";
	}
}
