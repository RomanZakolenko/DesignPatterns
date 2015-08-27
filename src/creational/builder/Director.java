package creational.builder;

public class Director {
	private LaptopBuilder builder;

	public void setLaptopBuilder(LaptopBuilder b) {
		builder = b;
	}

	public Laptop getLaptop() {
		return builder.getLattop();
	}

	public void constructLaptop() {
		builder.createLaptop();
		builder.setMonitorResolution();
		builder.setMemory();
		builder.setHdd();
		builder.setProcessor();
		builder.setBattery();
	}
}
