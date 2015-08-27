package behavioral.interpreter;

public class Laptop extends Goods {

	@Override
	public String interpret(PriceContext context) {
		return context.getPrice("Laptop");
	}

}
