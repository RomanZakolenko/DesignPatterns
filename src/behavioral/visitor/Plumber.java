package behavioral.visitor;

public class Plumber implements VisitorInterface {
	@Override
	public void visit(Room room) {
		System.out.println("Diagnosis of plumbing in room number " + room.getNumber());
	}

	@Override
	public void visit(Floor floor) {
		System.out.println("Diagnosis of plumbing on floor number " + floor.getNumber());
	}

	@Override
	public void visit(Company company) {
		System.out.println("Diagnosis of plumbing in company " + company.getTitle());
	}

}
