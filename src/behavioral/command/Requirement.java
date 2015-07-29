package behavioral.command;

public class Requirement {
	private String title;

	public Requirement(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return this.title;
	}
}
