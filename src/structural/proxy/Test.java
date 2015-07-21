package structural.proxy;

public class Test {
	public static void main(String[] args) {
		MathOperation math = new MathProxy();
		System.out.println("25 * 6 = " + math.mul(25, 6));
	}
}
