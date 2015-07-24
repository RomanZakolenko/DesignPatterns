package behavioral.chainofresponsibility;

public class ConcreteVisitorA extends CafeVisitor {
	public ConcreteVisitorA(String food) {
		this.priority = food;
	}
  
	@Override
	protected void eatFood() {
		System.out.println("ConcreteVisitorA: I ate " + this.priority);
	}
}
