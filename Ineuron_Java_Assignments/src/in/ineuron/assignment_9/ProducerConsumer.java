package in.ineuron.assignment_9;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    static class Producer extends Thread {
        private final Queue<Integer> queue;
        
        Producer(Queue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (queue) {
                        queue.add(i);
                        System.out.println("Produced: " + i);
                        queue.notify(); // Notify consumer
                        queue.wait(); // Wait for consumer to consume
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer extends Thread {
        private final Queue<Integer> queue;
        
        Consumer(Queue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (queue) {
                        while (queue.isEmpty()) {
                            queue.wait(); // Wait for producer to produce
                        }
                        int item = queue.poll();
                        System.out.println("Consumed: " + item);
                        queue.notify(); // Notify producer
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedList<>();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}

