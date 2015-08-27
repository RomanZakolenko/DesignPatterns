package creational.builder;

public class GamingLaptopBuilder extends LaptopBuilder {

	@Override
	public void setMonitorResolution() {
		laptop.setMonitorResolution("1900X1200");
	}

	@Override
	public void setProcessor() {
		laptop.setProcessor("Intel Core i7");
	}

	@Override
	public void setMemory() {
		laptop.setMemory("8 GB");
	}

	@Override
	public void setHdd() {
		laptop.setHDD("2 TB");
	}

	@Override
	public void setBattery() {
		laptop.setBattery("12 lbs");
	}

}
