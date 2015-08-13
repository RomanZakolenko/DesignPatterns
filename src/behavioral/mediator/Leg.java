package behavioral.mediator;

public class Leg extends BodyPart {
	public Leg(Brain brain) {
		super(brain);
	}

	public void run() {
		System.out.println("I'm run!");
	}
}
