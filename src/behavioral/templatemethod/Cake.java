package behavioral.templatemethod;

public class Cake extends Food {

	@Override
	public void setStovesTemperature() {
		System.out.println("Furnace temperature was set at 60 degrees.");
	}

	@Override
	public void addIngredients() {
		System.out.println("Add chicken eggs large, vanilla sugar, powdered sugar, butter, flour, cream cheese.");
	}
}
