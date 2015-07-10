package creational.builder;

public class Laptop {
	private String MonitorResolution;
	private String Processor;
	private String Memory;
	private String HDD;
	private String Battery;

	public String getMonitorResolution() {
		return new String(MonitorResolution);
	}

	public void setMonitorResolution(String monitorResolution) {
		MonitorResolution = new String(monitorResolution);
	}

	public String getProcessor() {
		return new String(Processor);
	}

	public void setProcessor(String processor) {
		Processor = new String(processor);
	}

	public String getMemory() {
		return new String(Memory);
	}

	public void setMemory(String memory) {
		Memory = new String(memory);
	}

	public String getHDD() {
		return new String(HDD);
	}

	public void setHDD(String hDD) {
		HDD = new String(hDD);
	}

	public String getBattery() {
		return new String(Battery);
	}

	public void setBattery(String battery) {
		Battery = new String(battery);
	}

	@Override
	public String toString() {
		return "Laptop [MonitorResolution=" + MonitorResolution + ", Processor=" + Processor + ", Memory=" + Memory
				+ ", HDD=" + HDD + ", Battery=" + Battery + "]";
	}

}
