package com.collections;
import java.util.concurrent.*;

public class BlockingQueueDemo {
    public static void main(String[] args) throws Exception {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

        queue.put(10);
        queue.put(20);

        // queue.put(30); // waits if full

        System.out.println(queue.take()); // removes element
    }
}