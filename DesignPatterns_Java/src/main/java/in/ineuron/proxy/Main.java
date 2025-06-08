package in.ineuron.proxy;

public class Main {
	
	public static void main(String[] args) {
		
		DatabaseExecutorProxy proxy= new DatabaseExecutorProxy("admin","admin");
		proxy.executeDatabase("select * from employees");
		
		System.out.println("************************");
		DatabaseExecutorProxy proxy1= new DatabaseExecutorProxy("admin","admin");
		proxy1.executeDatabase("delete * from employees");
		
		System.out.println("************************");
		DatabaseExecutorProxy proxy2= new DatabaseExecutorProxy("admin","admin123");
		proxy2.executeDatabase("select * from employees");
		
		System.out.println("************************");
		DatabaseExecutorProxy proxy3= new DatabaseExecutorProxy("admin","admin123");
		proxy3.executeDatabase("delete * from employees");
	}

}
