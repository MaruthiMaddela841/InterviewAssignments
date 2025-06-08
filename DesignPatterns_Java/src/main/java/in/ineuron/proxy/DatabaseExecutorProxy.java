package in.ineuron.proxy;

public class DatabaseExecutorProxy implements DatabaseExecutor {

	boolean ifAdmin;
	DatabaseExecutorImpl databaseExecutorImpl;
	
	public DatabaseExecutorProxy(String name,String password) {
		if(name.equals("admin") && password.equals("admin")) {
			ifAdmin=true;
		}
		databaseExecutorImpl=new DatabaseExecutorImpl();
	}
	
	@Override
	public void executeDatabase(String query) {
		
		if(ifAdmin) {
			System.out.println("Admin can delete also.");
			databaseExecutorImpl.executeDatabase(query);
		}
		else {
			
			if(query.startsWith("delete")) {
				System.out.println("Non Admin cannot delete.");
			}
			else {
				System.out.println("Non Admin can perform non delete.");
				databaseExecutorImpl.executeDatabase(query);
			}
			
		}
		
		

	}

}
