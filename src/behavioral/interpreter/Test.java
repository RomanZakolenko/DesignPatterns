package behavioral.interpreter;

public class Test {
	public static void main(String[] args) {
		GoodsPackage goodsPackage = new GoodsPackage();
		goodsPackage.addGoods(new Laptop());
		goodsPackage.addGoods(new Tv());
		GoodsPackage innerPackage = new GoodsPackage();
		innerPackage.addGoods(new Tv());
		innerPackage.addGoods(new Tv());
		goodsPackage.addGoods(innerPackage);
		PriceContext priceContext = new PriceContext();
		priceContext.setPrice("TV", "99.9");
		priceContext.setPrice("Laptop", "109.9");
		System.out.println("Summary price : " + goodsPackage.interpret(priceContext));
	}
}
