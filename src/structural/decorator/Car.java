package structural.decorator;

public class Car {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void go() {
		System.out.println(this.type + " rides.");
	}
}
