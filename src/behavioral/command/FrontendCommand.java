package behavioral.command;

import java.util.List;

public class FrontendCommand implements CommandInterface {
	private Team team;
	private List<Requirement> requirement;

	public FrontendCommand(Team t, List<Requirement> r) {
		this.team = t;
		this.requirement = r;
	}

	public void execute() {
		team.complete(requirement);
	}
}
