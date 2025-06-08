package in.ineuron.builder;

public class Main {

	public static void main(String[] args) {
		
		Vehicle car= new Vehicle.VehicleBuilder("Car Engine",4).setAirbags(2).build();
		System.out.println(car);
		
		Vehicle bike= new Vehicle.VehicleBuilder("Bike Engine",4).build();
		System.out.println(bike);
		

	}

}
