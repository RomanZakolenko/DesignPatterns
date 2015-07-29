package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	protected List<CommandInterface> commands;

	public Customer() {
		this.commands = new ArrayList<CommandInterface>();
	}

	public void addCommand(CommandInterface command) {
		this.commands.add(command);
	}

	public void signContract() {
		for (CommandInterface c : commands) {
			c.execute();
		}
	}
}
