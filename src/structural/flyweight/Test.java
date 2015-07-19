package structural.flyweight;

public class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 500; i++) {
			new Elf();
			new Dwarf();
		}
	}
}
