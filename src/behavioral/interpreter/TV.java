package behavioral.interpreter;

public class TV extends Goods {

	@Override
	public String iterpret(PriceContext context) {
		return context.getPrice("TV");
	}

}
