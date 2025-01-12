package in.ineuron.assignment_8;

public class SumArrayThread {
    static class SumTask extends Thread {
        private int[] arr;
        private int start;
        private int end;
        private int sum = 0;
        
        SumTask(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
        }

        public int getSum() {
            return sum;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mid = arr.length / 2;

        SumTask task1 = new SumTask(arr, 0, mid);
        SumTask task2 = new SumTask(arr, mid, arr.length);

        task1.start();
        task2.start();

        task1.join();
        task2.join();

        int totalSum = task1.getSum() + task2.getSum();
        System.out.println("Total Sum: " + totalSum);
    }
}

