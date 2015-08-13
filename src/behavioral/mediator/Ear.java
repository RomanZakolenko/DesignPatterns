package behavioral.mediator;

public class Ear extends BodyPart {
	private String sound;

	public Ear(Brain brain) {
		super(brain);
	}

	public void hear(String sound) {
		this.sound = sound;
		action();
	}
	
	public String getSound(){
		return sound;
	}
}
