package in.ineuron.strategy;

public class Main {

	public static void main(String[] args) {
		
		AccessStrategy adminAccess = new AdminAccessStrategy();
        AccessStrategy nonAdminAccess = new NonAdminAccessStrategy();

        User adminUser = new User("Alice", adminAccess);
        User normalUser = new User("Bob", nonAdminAccess);

        adminUser.showScreens();    // Admin screens
        normalUser.showScreens();   // Non-admin screens

        // Optional: change role dynamically
        System.out.println("Bob got promoted to Admin!");
        normalUser.setAccessStrategy(adminAccess);
        normalUser.showScreens();

	}

}
