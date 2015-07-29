package behavioral.command;

import java.util.List;

public class BackendCommand implements CommandInterface {
	private Team team;
	private List<Requirement> requirements;

	public BackendCommand(Team t, List<Requirement> r) {
		this.team = t;
		this.requirements = r;
	}

	public void execute() {
		team.complete(requirements);
	}
}
