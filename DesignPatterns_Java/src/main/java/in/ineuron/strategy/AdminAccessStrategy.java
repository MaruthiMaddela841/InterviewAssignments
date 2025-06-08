package in.ineuron.strategy;

public class AdminAccessStrategy implements AccessStrategy {

	@Override
	public void showAccessibleScreens() {

		System.out.println("Accessible screens for Admin:");
		System.out.println("- Home Page");
		System.out.println("- Orders Page");
		System.out.println("- Delete User Page");
		System.out.println("- Transactions Page");

	}

}
