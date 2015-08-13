package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		List<Requirement> backendRequir = new ArrayList<Requirement>();
		backendRequir.add(new Requirement("database settings"));
		backendRequir.add(new Requirement("server settings"));
		CommandInterface backendCommand = new BackendCommand(new Team("IOTeam"), backendRequir);
		customer.addCommand(backendCommand);
		List<Requirement> frontendRequir = new ArrayList<Requirement>();
		frontendRequir.add(new Requirement("interactivity settings"));
		frontendRequir.add(new Requirement("browsing settings"));
		CommandInterface frontendCommand = new FrontendCommand(new Team("FrontTeam"), frontendRequir);
		customer.addCommand(frontendCommand);
		customer.signContract();
	}
}
