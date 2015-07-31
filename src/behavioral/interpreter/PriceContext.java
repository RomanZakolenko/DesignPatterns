package behavioral.interpreter;

import java.util.HashMap;

public class PriceContext {
	private HashMap<String, String> prices;

	public PriceContext() {
		this.prices = new HashMap<String, String>();
	}

	public void setPrice(String goods, String price) {
		this.prices.put(goods, price);
	}

	public String getPrice(String key) {
		return this.prices.get(key);
	}
}
