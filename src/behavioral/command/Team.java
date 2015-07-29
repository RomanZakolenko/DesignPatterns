package behavioral.command;

import java.util.Iterator;
import java.util.List;

public class Team {
	private String name;

	public Team(String n) {
		this.name = n;
	}

	public void complete(List<Requirement> r) {
		Iterator<Requirement> iter = r.iterator();
		while(iter.hasNext()){
			System.out.println("Team "+this.name+" complete: "+iter.next());
		}
	}
}
