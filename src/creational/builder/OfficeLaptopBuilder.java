package creational.builder;

public class OfficeLaptopBuilder extends LaptopBuilder {

	@Override
	public void setMonitorResolution() {
		laptop.setMonitorResolution("1366X800");
	}

	@Override
	public void setProcessor() {
		laptop.setProcessor("Intel Core 2 Duo");
	}

	@Override
	public void setMemory() {
		laptop.setMemory("1 GB");
	}

	@Override
	public void setHdd() {
		laptop.setHDD("500 GB");
	}

	@Override
	public void setBattery() {
		laptop.setBattery("6 lbs");
	}

}
