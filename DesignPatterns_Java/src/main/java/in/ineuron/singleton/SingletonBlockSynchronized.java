package in.ineuron.singleton;

public class SingletonBlockSynchronized {
	
	private static SingletonBlockSynchronized s=null;
	
	private SingletonBlockSynchronized() {
		
	}
	
	public static SingletonBlockSynchronized getinstance() {
		if(s==null) {
			synchronized(SingletonBlockSynchronized.class) {
				s=new SingletonBlockSynchronized();
				return s;
			}
		}
		return s;
	}

}
