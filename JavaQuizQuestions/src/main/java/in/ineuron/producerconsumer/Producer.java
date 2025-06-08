package in.ineuron.producerconsumer;

public class Producer implements Runnable{
	
	private SharedBuffer sharedBuffer = null;
	
	public Producer(SharedBuffer sb) {
		sharedBuffer=sb;
	}

	@Override
	public void run() {
		int value=1;
		try {
			while(true) {
				sharedBuffer.produce(value++);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			//code
		}
		
	}
	
	

}
