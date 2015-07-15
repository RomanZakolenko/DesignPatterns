package structural.bridge;

public class BuildingCompanyB extends BuildingCompany {
	public BuildingCompanyB(WallBuilder w) {
		this.wallBulder = w;
	}

	@Override
	public void buildHouse() {
		System.out.println("The CompanyB began construction house.");
		wallBulder.buildWall();
		System.out.println("House is built");
	}

	@Override
	public void buildRoom() {
		System.out.println("The CompanyB began construction room.");
		wallBulder.buildWall();
		System.out.println("Room is built");
	}

	@Override
	public void buildFlat() {
		System.out.println("The CompanyB began construction flat.");
		wallBulder.buildWall();
		System.out.println("Flat is built");
	}

}
