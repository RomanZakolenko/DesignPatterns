package creational.builder;

public class Laptop {
	private String monitorResolution;
	private String processor;
	private String memory;
	private String hdd;
	private String battery;

	public String getMonitorResolution() {
		return new String(monitorResolution);
	}

	public void setMonitorResolution(String monitorResolution) {
		monitorResolution = new String(monitorResolution);
	}

	public String getProcessor() {
		return new String(processor);
	}

	public void setProcessor(String processor) {
		processor = new String(processor);
	}

	public String getMemory() {
		return new String(memory);
	}

	public void setMemory(String memory) {
		memory = new String(memory);
	}

	public String getHdd() {
		return new String(hdd);
	}

	public void setHDD(String hDD) {
		hdd = new String(hDD);
	}

	public String getBattery() {
		return new String(battery);
	}

	public void setBattery(String battery) {
		battery = new String(battery);
	}

	@Override
	public String toString() {
		return "Laptop [MonitorResolution=" + monitorResolution + ", Processor=" + processor + ", Memory=" + memory
				+ ", HDD=" + hdd + ", Battery=" + battery + "]";
	}

}
