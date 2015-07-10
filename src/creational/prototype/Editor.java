package creational.prototype;

public class Editor {
	private PointPrototype point;

	public PointPrototype getPoint() {
		return point;
	}

	public void setPoint(PointPrototype point) {
		this.point = point;
	}

	public Editor() {
	}

	public Editor(PointPrototype p) {
		setPoint(p);
	}
	public PointPrototype drawPoint() throws CloneNotSupportedException{
		return point.clone();
	}
}
