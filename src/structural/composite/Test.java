package structural.composite;

public class Test {
	public static void main(String[] args) {
		XMLComponent doc = new XMLComponent("Document");
		XMLComponent body = new XMLComponent("Body");
		OrderXMLComponent order1 = new OrderXMLComponent("order1", "first");
		OrderXMLComponent order2 = new OrderXMLComponent("order2", "second");
		OrderXMLComponent order3 = new OrderXMLComponent("order3", "third");
		body.addComponent(order1);
		body.addComponent(order2);
		body.addComponent(order3);
		doc.addComponent(body);
		doc.print();
	}
}
