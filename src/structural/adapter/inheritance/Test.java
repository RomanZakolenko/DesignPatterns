package structural.adapter.inheritance;

public class Test {
	public static void main(String[] args) {
		Target t = new Adapter();
		System.out.println(t.requestA());
		System.out.println(t.requestB());
	}
}
