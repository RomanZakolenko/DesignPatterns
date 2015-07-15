package structural.adapter.composition;

public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(Adaptee ad) {
		adaptee = ad;
	}

	@Override
	public String requestA() {
		return adaptee.adapteeRequestA();
	}

	@Override
	public String requestB() {
		return adaptee.adapteeRequestB();
	}

}
