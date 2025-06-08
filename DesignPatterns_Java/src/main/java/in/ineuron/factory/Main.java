package in.ineuron.factory;

public class Main {

	public static void main(String[] args) {
		
		VehicleFactory v= new VehicleFactory();
		System.out.println(v.getInstance("Car",4));
		System.out.println(v.getInstance("Bike",2));
	}

}
