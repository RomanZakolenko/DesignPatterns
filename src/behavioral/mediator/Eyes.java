package behavioral.mediator;

public class Eyes extends BodyPart {
	private String image;

	public Eyes(Brain brain) {
		super(brain);
	}

	public void look(String img) {
		this.image = img;
		action();
	}

	public String getImage() {
		return image;
	}
}
