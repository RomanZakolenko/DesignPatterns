package behavioral.memento;

public class Test {
	public static void main(String[] args) {
		GameInterface gameInterface = new GameInterface();
		gameInterface.play();
		System.out.println(gameInterface.getGame().getState());
		gameInterface.f5();
		System.out.println(gameInterface.getGame().getState());
		gameInterface.play();
		gameInterface.play();
		System.out.println(gameInterface.getGame().getState());
		gameInterface.f9();
		System.out.println(gameInterface.getGame().getState());
	}
}
