package in.ineuron.proxy;

public class Main {
	
	//1. Visual Proxy
	// 2. Protection Proxy
	// 3. Remote Proxy
	
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
