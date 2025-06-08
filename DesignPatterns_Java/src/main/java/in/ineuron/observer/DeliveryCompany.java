package in.ineuron.observer;

public class DeliveryCompany implements Observer {

	@Override
	public void update(String location) {
		
		System.out.println("DeliveryCompany Notified -> Location::"+location);
		
	}

}
