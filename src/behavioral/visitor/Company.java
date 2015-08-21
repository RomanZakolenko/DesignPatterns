package behavioral.visitor;

import java.util.List;
import java.util.ArrayList;

public class Company implements ElementInterface {
	private String title;
	private List<Floor> floors = new ArrayList<Floor>();

	public Company(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
		for (Floor f : floors) {
			f.accept(v);
		}
	}

	public boolean addFloor(Floor floor) {
		return this.floors.add(floor);
	}
}
