package behavioral.interpreter;

public class Laptop extends Goods {

	@Override
	public String iterpret(PriceContext context) {
		return context.getPrice("Laptop");
	}

}
