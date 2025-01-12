package in.ineuron.assignment_8;

public class CounterThread {
    static int counter = 0;
    
    static class IncrementThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (CounterThread.class) {
                    counter++;
                    System.out.println("Incremented: " + counter);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class DecrementThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (CounterThread.class) {
                    counter--;
                    System.out.println("Decremented: " + counter);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread incrementThread = new IncrementThread();
        Thread decrementThread = new DecrementThread();
        
        incrementThread.start();
        decrementThread.start();
    }
}

