package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XMLComponent implements XMLDocument {

	private String name;
	private List<XMLDocument> components = new ArrayList<XMLDocument>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<XMLDocument> getComponents() {
		return components;
	}

	public void setComponents(List<XMLDocument> components) {
		this.components = components;
	}

	public XMLComponent(String name) {
		setName(name);
	}

	public void addComponent(XMLDocument doc) {
		components.add(doc);
	}

	@Override
	public void print() {
		if (!components.isEmpty()) {
			Iterator<XMLDocument> iter = components.iterator();
			System.out.println("<" + this + ">");
			while (iter.hasNext()) {
				iter.next().print();
			}
			System.out.println("<" + this + "/>");
		} else {
			System.out.println("<" + this + ">" + "<" + this + "/>");
		}
	}

	@Override
	public String toString() {
		return this.name;
	}
}
