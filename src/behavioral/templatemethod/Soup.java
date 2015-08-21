package behavioral.templatemethod;

public class Soup extends Food {

	@Override
	public void setStovesTemperature() {
		System.out.println("Furnace temperature was set at 100 degrees.");
	}

	@Override
	public void addIngredients() {
		System.out.println("Add onion, garlic, greens, grape seed oil, tomatoes, rice, fish.");
	}

}
