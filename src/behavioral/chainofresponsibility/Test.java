package behavioral.chainofresponsibility;

public class Test {
	public static void main(String[] args) {
		CafeVisitor visitorA = new ConcreteVisitorA("meat");
		CafeVisitor visitorB = new ConcreteVisitorB("soup");
		CafeVisitor visitorC = new ConcreteVisitorC("cake");
		visitorA.setNext(visitorB);
		visitorB.setNext(visitorC);
		visitorA.getFood("cake");
		visitorA.getFood("meat");
		visitorA.getFood("soup");
	}
}
