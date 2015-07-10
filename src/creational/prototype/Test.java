package creational.prototype;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		PointPrototype p = new PositivePoint();
		p.setX(50);
		p.setY(100);
		Editor ed = new Editor(p);
		for (int i = 0; i < 10; i++) {
			System.out.println(ed.drawPoint());
		}
	}
}
