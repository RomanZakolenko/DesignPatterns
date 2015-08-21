package behavioral.visitor;

public class Room implements ElementInterface {
	private String number;

	public Room(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
	}
}