package structural.proxy;

public class MathProxy implements MathOperation {
	private ConcreteMath math;

	@Override
	public double sum(double... a) {
		if (math == null) {
			math = new ConcreteMath();
		}
		return math.sum(a);
	}

	@Override
	public double sub(double a, double b) {
		if (math == null) {
			math = new ConcreteMath();
		}
		return math.sub(a, b);
	}

	@Override
	public double mul(double a, double b) {
		if (math == null) {
			math = new ConcreteMath();
		}
		return math.mul(a, b);
	}

	@Override
	public double div(double a, double b) {
		if (math == null) {
			math = new ConcreteMath();
		}
		return math.div(a, b);
	}

}
