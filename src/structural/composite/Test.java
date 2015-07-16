package structural.composite;

public class Test {
	public static void main(String[] args) {
		XMLComponent doc = new XMLComponent("Document");
		XMLComponent body = new XMLComponent("Body");
		XMLComponent order1 = new XMLComponent("order1");
		XMLComponent order2 = new XMLComponent("order2");
		XMLComponent order3 = new XMLComponent("order3");
		body.addComponent(order1);
		body.addComponent(order2);
		body.addComponent(order3);
		doc.addComponent(body);
		doc.printChild();
	}
}
