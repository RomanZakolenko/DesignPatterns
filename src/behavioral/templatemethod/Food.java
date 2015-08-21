package behavioral.templatemethod;

public abstract class Food {
	public abstract void setStovesTemperature();

	public abstract void addIngredients();

	public void addSeasonings() {
		System.out.println("Add salt.");
	}

	public void cooking() {
		setStovesTemperature();
		addIngredients();
		addSeasonings();
	}
}
