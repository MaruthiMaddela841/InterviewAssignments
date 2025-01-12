package in.ineuron.assignment_8;

public class PrimeNumbers {
    static class PrimeTask extends Thread {
        private int start, end;
        private int primeCount = 0;

        PrimeTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    primeCount++;
                }
            }
        }

        private boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public int getPrimeCount() {
            return primeCount;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int range = 100000;
        int mid = range / 2;

        PrimeTask task1 = new PrimeTask(1, mid);
        PrimeTask task2 = new PrimeTask(mid + 1, range);

        task1.start();
        task2.start();

        task1.join();
        task2.join();

        int totalPrimeCount = task1.getPrimeCount() + task2.getPrimeCount();
        System.out.println("Total primes: " + totalPrimeCount);
    }
}

