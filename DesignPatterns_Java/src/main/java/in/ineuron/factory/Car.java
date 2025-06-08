package in.ineuron.factory;

public class Car extends Vehicle{
	
	int wheel;

	Car(int wheel){
		this.wheel=wheel;
	}
	
	@Override
	public int getWheel() {
		return this.wheel;
	}

	public String toString() {
		return "Car Wheel:: "+this.getWheel();
	}
}
