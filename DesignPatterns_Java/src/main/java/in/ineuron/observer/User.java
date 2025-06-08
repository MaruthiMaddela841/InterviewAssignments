package in.ineuron.observer;

public class User implements Observer {

	@Override
	public void update(String location) {
		
		System.out.println("User Notified -> Location::"+location);
		
	}

}
