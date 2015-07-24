package behavioral.chainofresponsibility;

public class ConcreteVisitorB extends CafeVisitor {
	public ConcreteVisitorB(String food) {
		this.priority = food;
	}

	@Override
	protected void eatFood() {
		System.out.println("ConcreteVisitorB: I ate " + this.priority);
	}
}
