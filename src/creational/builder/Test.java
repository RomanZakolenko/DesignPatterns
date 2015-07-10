package creational.builder;

public class Test {
	public static void main(String[] args) {
		Director director = new Director();
		director.setLaptopBuilder(new GamingLaptopBuilder());
		director.constructLaptop();
		System.out.println(director.getLaptop());
		director.setLaptopBuilder(new OfficeLaptopBuilder());
		director.constructLaptop();
		System.out.println(director.getLaptop());
	}
}
