package in.ineuron.producerconsumer;

public class Main {

	public static void main(String[] args) {
		
		SharedBuffer sb= new SharedBuffer();
		Thread producer=new Thread(new Producer(sb),"Producer");
		Thread consumer=new Thread(new Consumer(sb),"consumer");
		producer.start();
		consumer.start();
	}

}
