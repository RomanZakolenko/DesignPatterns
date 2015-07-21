package structural.proxy;

public class ConcreteMath implements MathOperation {

	@Override
	public double sum(double... a) {
		double res = 0;
		for (double x : a) {
			res += x;
		}
		return res;
	}

	@Override
	public double sub(double a, double b) {
		return a - b;
	}

	@Override
	public double mul(double a, double b) {
		return a * b;
	}

	@Override
	public double div(double a, double b) {
		return a / b;
	}

}
