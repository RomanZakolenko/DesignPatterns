package behavioral.visitor;

public class Electrician implements VisitorInterface {
	@Override
	public void visit(Room room) {
		System.out.println("Diagnosis of electrical in room number " + room.getNumber());
	}

	@Override
	public void visit(Floor floor) {
		System.out.println("Diagnosis of electrical on floor number " + floor.getNumber());
	}

	@Override
	public void visit(Company company) {
		System.out.println("Diagnosis of electrical in company " + company.getTitle());
	}
}
