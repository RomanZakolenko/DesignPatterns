package behavioral.mediator;

public class Test {
	public static void main(String[] args) {
		Brain brain = new Brain();
		Ear ear = brain.getEar();
		Eyes eyes = brain.getEyes();
		ear.hear("Hello");
		eyes.look("Cousin");
		ear.hear("Boom");
	}
}
