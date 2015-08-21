package behavioral.strategy;

public class RainyWearing implements WearingStrategy {
	public String getClothes() {
		return "Jacket";
	}

	public String getAccessories() {
		return "Umbrella";
	}
}
