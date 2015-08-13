package behavioral.mediator;

public class BodyPart {
	private final Brain brain;
	
	public BodyPart(Brain brain){
		this.brain = brain;
	}
	
	public void action(){
		brain.listenAction(this);
	}
}
