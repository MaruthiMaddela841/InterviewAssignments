package in.ineuron.strategy;

public class Main {

	public static void main(String[] args) {
		//Strategy = put different algorithms behind the same interface 
		//			 so you can choose the algorithm at runtime.
		
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
        
        
        //Another Example
        Notification email= new Email(new AES(), new ZIP());
        email.encrypt();
        email.compress();
        email.send();
        
        Notification sms= new Sms(new AES(), new RAR());
        email.encrypt();
        email.compress();
        email.send();
        
        Notification push= new Sms(new RAS(), new RAR());
        push.encrypt();
        push.compress();
        push.send();

	}

}
