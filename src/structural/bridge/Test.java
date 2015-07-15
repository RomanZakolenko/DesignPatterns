package structural.bridge;

public class Test {
	public static void main(String[] args) {
		BrickWallBuilder brickWallBuilder = new BrickWallBuilder();
		WoodWallBuilder woodWallBuilder = new WoodWallBuilder();
		BuildingCompany company = new BuildingCompanyA(brickWallBuilder);
		company.buildFlat();
		company.buildHouse();
		company.buildRoom();
		company.setWallBulder(woodWallBuilder);
		company.buildFlat();
		company.buildHouse();
		company.buildRoom();
	}
}
