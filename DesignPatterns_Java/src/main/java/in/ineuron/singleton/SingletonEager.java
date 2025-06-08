package in.ineuron.singleton;

public class SingletonEager {
	
	private static final SingletonEager s= new SingletonEager();
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getinstance() {
		return s;
	}

}
