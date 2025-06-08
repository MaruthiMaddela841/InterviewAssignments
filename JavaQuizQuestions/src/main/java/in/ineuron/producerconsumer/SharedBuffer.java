package in.ineuron.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
	
	private final Queue<Integer> buffer=new LinkedList<>();
	private final int CAPACITY=5;
	
	//Producer Method
	public synchronized void produce(int value) throws InterruptedException {
		while(buffer.size()==CAPACITY) {
			System.out.println("Buffer is Full");
			wait();
		}
		buffer.add(value);
		System.out.println("Produced::"+value);
		notify();
	}
	
	//Consumer Method
	public synchronized int consume() throws InterruptedException {
		while(buffer.isEmpty()) {
			System.out.println("Buffer is Empty");
			wait();
		}
		Integer item = buffer.poll();
		System.out.println("Consumed::"+item);
		notify();
		return item;
	}

}
