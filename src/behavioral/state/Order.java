package behavioral.state;

import java.util.List;
import java.util.ArrayList;

public class Order {
	private OrderState state = new NewOrder(this);
	private List<Product> products = new ArrayList<Product>();

	public void setState(OrderState state) {
		this.state = state;
	}

	public OrderState getState() {
		return state;
	}

	public List<Product> getProduct() {
		return products;
	}

	public boolean addProduct(Product product) {
		return state.addProduct(product);
	}

	public void register() {
		state.register();
	}

	public void invoice() {
		state.invoice();
	}

	public void cancel() {
		state.cancel();
	}

	@Override
	public String toString() {
		return "Order [ " + state + ", products = " + products + " ] ";
	}
}
