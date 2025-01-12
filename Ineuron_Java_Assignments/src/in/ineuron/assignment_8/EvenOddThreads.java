package in.ineuron.assignment_8;

public class EvenOddThreads {
    
    // Thread to print even numbers
    static class EvenThread extends Thread {
        @Override
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(5000);  // Adding a small delay for demonstration
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Thread to print odd numbers
    static class OddThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 9; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(500);  // Adding a small delay for demonstration
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create instances of EvenThread and OddThread
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        // Start both threads
        evenThread.start();
        oddThread.start();
        
        try {
            // Wait for both threads to complete
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished execution.");
    }
}
