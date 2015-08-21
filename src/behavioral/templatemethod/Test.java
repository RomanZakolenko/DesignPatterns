package behavioral.templatemethod;

public class Test {
	public static void main(String[] args) {
		Food cake = new Cake();
		Food soup = new Soup();
		cake.cooking();
		soup.cooking();
	}
}
