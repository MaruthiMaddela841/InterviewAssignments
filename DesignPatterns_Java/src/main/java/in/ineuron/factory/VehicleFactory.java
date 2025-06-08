package in.ineuron.factory;

public class VehicleFactory {
	
	public static Vehicle getInstance(String type, int wheel) {
		if(type.equals("Car")) {
			return new Car(wheel);
		}
		
		if(type.equals("Bike")) {
			return new Bike(wheel);
		}
		return null;
	}

}
