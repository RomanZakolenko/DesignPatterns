package structural.bridge;

public class WoodWallBuilder implements WallBuilder {

	@Override
	public void buildWall() {
		System.out.println("Wood wall is built");
	}
}
