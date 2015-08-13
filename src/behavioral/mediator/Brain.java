package behavioral.mediator;

public class Brain {
	private Ear ears;
	private Eyes eyes;
	private Leg legs;
	private Hand hands;

	public Brain() {
		this.ears = new Ear(this);
		this.eyes = new Eyes(this);
		this.legs = new Leg(this);
		this.hands = new Hand(this);
	}

	public void listenAction(BodyPart bodyPart) {
		if (bodyPart instanceof Ear) {
			Ear ears = (Ear) bodyPart;
			if (ears.getSound().equalsIgnoreCase("Boom")) {
				legs.run();
			}
			if (ears.getSound().equalsIgnoreCase("Hello")) {
				hands.welcomingHand();
			}
		} else if (bodyPart instanceof Eyes) {
			Eyes eyes = (Eyes) bodyPart;
			if (eyes.getImage().equalsIgnoreCase("Cousin")) {
				hands.hug();
			}
			if (eyes.getImage().equalsIgnoreCase("Rain")) {
				legs.run();
			}
		}
	}

	public Ear getEar() {
		return ears;
	}

	public Eyes getEyes() {
		return eyes;
	}

	public Leg getLegs() {
		return legs;
	}

	public Hand getHands() {
		return hands;
	}
}
