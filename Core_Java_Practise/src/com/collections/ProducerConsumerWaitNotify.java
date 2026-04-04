package com.collections;
class SharedBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait(); // wait until consumed
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // notify consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasData) {
            wait(); // wait until produced
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify(); // notify producer
        return data;
    }
}

public class ProducerConsumerWaitNotify {
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        // Producer Thread
        Thread producer = new Thread(() -> {
            int i = 1;
            try {
                while (true) {
                    buffer.produce(i++);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {}
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    buffer.consume();
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {}
        });

        producer.start();
        consumer.start();
    }
}