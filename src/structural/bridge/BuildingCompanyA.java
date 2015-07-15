package structural.bridge;

public class BuildingCompanyA extends BuildingCompany {

	public BuildingCompanyA(WallBuilder w) {
		this.setWallBulder(w);
	}

	@Override
	public void buildHouse() {
		System.out.println("The CompanyA began construction house.");
		wallBulder.buildWall();
		System.out.println("House is built");
	}

	@Override
	public void buildRoom() {
		System.out.println("The CompanyA began construction room.");
		wallBulder.buildWall();
		System.out.println("Room is built");
	}

	@Override
	public void buildFlat() {
		System.out.println("The CompanyA began construction flat.");
		wallBulder.buildWall();
		System.out.println("Flat is built");
	}

}
