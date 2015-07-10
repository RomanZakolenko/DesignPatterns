package creational.builder;

public abstract class LaptopBuilder {
	protected Laptop laptop;

	public void createLaptop() {
		laptop = new Laptop();
	}

	public Laptop getLattop() {
		return laptop;
	}

	public abstract void setMonitorResolution();

	public abstract void setProcessor();

	public abstract void setMemory();

	public abstract void setHDD();

	public abstract void setBattery();
}
