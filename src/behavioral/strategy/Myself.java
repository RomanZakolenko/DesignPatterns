package behavioral.strategy;

public class Myself {
	private WearingStrategy wearingStrategy = new SunshineWearing();
	private String clothes;
	private String accessories;

	public void setWearingStrategy(WearingStrategy strategy) {
		wearingStrategy = strategy;
	}

	public void walk() {
		clothes = wearingStrategy.getClothes();
		accessories = wearingStrategy.getAccessories();
		System.out.println("I'll go for a walk. I wore a " + clothes + " and took " + accessories + ".");
	}
}
