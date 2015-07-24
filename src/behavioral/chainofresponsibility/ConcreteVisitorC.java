package behavioral.chainofresponsibility;

public class ConcreteVisitorC extends CafeVisitor {
	public ConcreteVisitorC(String food) {
		this.priority = food;
	}

	@Override
	protected void eatFood() {
		System.out.println("ConcreteVisitorC: I ate " + this.priority);
	}
}
