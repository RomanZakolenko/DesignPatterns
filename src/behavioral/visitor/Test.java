package behavioral.visitor;

public class Test {
	public static void main(String[] args) {
		Company company = new Company("RZ");
		Floor floorOne = new Floor("1");
		Floor floorTwo = new Floor("2");
		floorOne.addRoom(new Room("101"));
		floorOne.addRoom(new Room("102"));
		floorOne.addRoom(new Room("103"));
		floorTwo.addRoom(new Room("201"));
		floorTwo.addRoom(new Room("202"));
		floorTwo.addRoom(new Room("203"));
		company.addFloor(floorOne);
		company.addFloor(floorTwo);
		Electrician electrician = new Electrician();
		Plumber plumber = new Plumber();
		company.accept(electrician);
		company.accept(plumber);
	}
}
