package behavioral.visitor;

import java.util.List;
import java.util.ArrayList;

public class Floor implements ElementInterface {
	private String number;
	private List<Room> rooms = new ArrayList<Room>();

	public Floor(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
		for (Room r : rooms) {
			r.accept(v);
		}
	}

	public boolean addRoom(Room room) {
		return this.rooms.add(room);
	}
}
