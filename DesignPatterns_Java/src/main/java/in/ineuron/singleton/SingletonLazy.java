package in.ineuron.singleton;

public class SingletonLazy {
	
	private static SingletonLazy s=null;
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getinstance() {
		if(s==null) {
			s=new SingletonLazy();
			return s;
		}
		return s;
	}

}
