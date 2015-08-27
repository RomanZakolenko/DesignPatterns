package behavioral.interpreter;

public class Tv extends Goods {

	@Override
	public String interpret(PriceContext context) {
		return context.getPrice("TV");
	}

}
