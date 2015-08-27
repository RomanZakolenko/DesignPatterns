package behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class GoodsPackage extends Goods {
	private List<Goods> goods;

	public GoodsPackage() {
		this.goods = new ArrayList<Goods>();
	}

	@Override
	public String interpret(PriceContext context) {
		double res = 0;
		for (Goods g : goods) {
			res += Double.parseDouble(g.interpret(context));
		}
		return Double.toString(res);
	}

	public void addGoods(Goods goods) {
		this.goods.add(goods);
	}
}
