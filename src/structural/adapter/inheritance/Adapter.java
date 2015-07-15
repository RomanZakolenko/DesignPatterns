package structural.adapter.inheritance;

public class Adapter extends Adaptee implements Target {

	@Override
	public String requestA() {
		return adapteeRequestA();
	}

	@Override
	public String requestB() {
		return adapteeRequestB();
	}

}
