package in.ineuron.builder;

public class Vehicle {
	
	private String engine;
	private int wheel;
	private int airbags;
	
	private Vehicle(VehicleBuilder builder) {
		this.engine=builder.engine;
		this.wheel=builder.wheel;
		this.airbags=builder.airbags;
	}
	
	public static class VehicleBuilder{
		private String engine;
		private int wheel;
		private int airbags;
		
		public VehicleBuilder(String engine,int wheel) {
			this.engine=engine;
			this.wheel=wheel;
		}
		
		public VehicleBuilder setAirbags(int airbags) {
			this.airbags=airbags;
			return this;
		}
		
		public Vehicle build() {
			return new Vehicle(this);
		}
	}
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getAirbags() {
		return airbags;
	}
	public void setAirbags(int airbags) {
		this.airbags = airbags;
	}
	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", wheel=" + wheel + ", airbags=" + airbags + "]";
	}

}
