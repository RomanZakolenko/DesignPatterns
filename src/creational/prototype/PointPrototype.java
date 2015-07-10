package creational.prototype;

public class PointPrototype implements Cloneable {
	protected int x;
	protected int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public PointPrototype clone() throws CloneNotSupportedException {
		PointPrototype point = new PointPrototype();
		point.setX(this.x);
		point.setY(this.y);
		return point;
	}

	@Override
	public String toString() {
		return "PointPrototype [x=" + x + ", y=" + y + "]";
	}

}
