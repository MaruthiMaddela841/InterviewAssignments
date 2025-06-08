package in.ineuron.observer;

public class Seller implements Observer {

	@Override
	public void update(String location) {
		
		System.out.println("Seller Notified -> Location::"+location);
		
	}

}
