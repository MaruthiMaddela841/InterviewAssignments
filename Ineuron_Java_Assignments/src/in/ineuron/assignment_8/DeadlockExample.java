package in.ineuron.assignment_8;

public class DeadlockExample {
    static class ThreadA extends Thread {
        private final Object lock1;
        private final Object lock2;

        ThreadA(Object lock1, Object lock2) {
            this.lock1 = lock1;
            this.lock2 = lock2;
        }

        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread A: Locked lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread A: Locked lock2");
                }
            }
        }
    }

    static class ThreadB extends Thread {
        private final Object lock1;
        private final Object lock2;

        ThreadB(Object lock1, Object lock2) {
            this.lock1 = lock1;
            this.lock2 = lock2;
        }

        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread B: Locked lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Thread B: Locked lock1");
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        ThreadA threadA = new ThreadA(lock1, lock2);
        ThreadB threadB = new ThreadB(lock1, lock2);

        threadA.start();
        threadB.start();
    }
}

