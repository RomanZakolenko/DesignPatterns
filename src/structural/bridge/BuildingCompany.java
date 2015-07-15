package structural.bridge;

public abstract class BuildingCompany {

	protected WallBuilder wallBulder;

	public WallBuilder getWallBulder() {
		return wallBulder;
	}

	public void setWallBulder(WallBuilder wallBulder) {
		this.wallBulder = wallBulder;
	}

	public abstract void buildHouse();

	public abstract void buildRoom();

	public abstract void buildFlat();
}
