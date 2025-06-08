package in.ineuron.strategy;

public class NonAdminAccessStrategy implements AccessStrategy {

	@Override
	public void showAccessibleScreens() {
		
		System.out.println("Accessible screens for Non-Admin:");
        System.out.println("- Home Page");
        System.out.println("- Orders Page");

	}

}
