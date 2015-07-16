package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class OrderXMLComponent implements XMLDocument {
	private String name;
	private String content;
	private List<XMLDocument> components = new ArrayList<XMLDocument>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<XMLDocument> getComponents() {
		return components;
	}

	public void setComponents(List<XMLDocument> components) {
		this.components = components;
	}

	public OrderXMLComponent(String name, String content) {
		setName(name);
		setContent(content);
	}

	public void addComponent(XMLDocument doc) {
		components.add(doc);
	}

	@Override
	public void print() {
		System.out.println("<" + this.name + ">" + this.content + "<" + this.name + "/>");
	}

}
