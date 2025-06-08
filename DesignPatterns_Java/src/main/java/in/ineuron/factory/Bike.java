package in.ineuron.factory;

public class Bike extends Vehicle{
	
	int wheel;
	
	Bike(int wheel){
		this.wheel=wheel;
	}

	@Override
	public int getWheel() {
		return this.wheel;
	}
	
	public String toString() {
		return "Bike Wheel:: "+this.getWheel();
	}

}
