package behavioral.state;

public interface OrderState {
	void register();

	void invoice();

	void cancel();

	boolean addProduct(Product product);
}
