package in.ineuron.singleton;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*************SingletonEager****************");
		
		SingletonEager s=SingletonEager.getinstance();
		SingletonEager s1=SingletonEager.getinstance();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println("*************SingletonLazy****************");
		
		SingletonLazy s2=SingletonLazy.getinstance();
		SingletonLazy s3=SingletonLazy.getinstance();
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println("*************SingletonMethodSynchronized****************");
		
		SingletonMethodSynchronized s4=SingletonMethodSynchronized.getinstance();
		SingletonMethodSynchronized s5=SingletonMethodSynchronized.getinstance();
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		System.out.println("*************SingletonBlockSynchronized****************");
		
		SingletonBlockSynchronized s6=SingletonBlockSynchronized.getinstance();
		SingletonBlockSynchronized s7=SingletonBlockSynchronized.getinstance();
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());
		
		

	}

}
