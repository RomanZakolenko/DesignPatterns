package behavioral.mediator;

public class Hand extends BodyPart {
	public Hand(Brain brain) {
		super(brain);
	}
    
	public void welcomingHand(){
		System.out.println("Welcoming hand!");
	}
	
	public void hug() {
		System.out.println("I hug you!");
	}

}
