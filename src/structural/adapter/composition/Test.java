package structural.adapter.composition;

public class Test {
	public static void main(String[] args) {
		Adapter ad = new Adapter(new Adaptee());
		System.out.println(ad.requestA());
		System.out.println(ad.requestB());
	}
}
