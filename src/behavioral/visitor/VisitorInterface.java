package behavioral.visitor;

public interface VisitorInterface {
	void visit(Room room);

	void visit(Floor floor);

	void visit(Company company);
}
