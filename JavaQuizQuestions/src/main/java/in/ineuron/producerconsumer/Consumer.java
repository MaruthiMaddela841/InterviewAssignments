package in.ineuron.producerconsumer;

public class Consumer implements Runnable{
	
	private SharedBuffer sharedBuffer = null;
	
	public Consumer(SharedBuffer sb) {
		sharedBuffer=sb;
	}

	@Override
	public void run() {
		int value=1;
		try {
			while(true) {
				sharedBuffer.consume();
				Thread.sleep(4000);
			}
		}
		catch(InterruptedException e) {
			//code
		}
		
	}
	
	

}
