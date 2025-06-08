package in.ineuron.singleton;

public class SingletonMethodSynchronized {
	
	private static SingletonMethodSynchronized s=null;
	
	private SingletonMethodSynchronized() {
		
	}
	
	public static synchronized SingletonMethodSynchronized getinstance() {
		if(s==null) {
			s=new SingletonMethodSynchronized();
			return s;
		}
		return s;
	}

}
