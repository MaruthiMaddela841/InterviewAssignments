package in.ineuron.assignment_8;

import java.util.Arrays;

public class MultiThreadSort {
    static class SortTask extends Thread {
        private int[] arr;
        private int start, end;

        SortTask(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            Arrays.sort(arr, start, end);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {9, 4, 7, 1, 5, 8, 6, 3, 2};
        int mid = arr.length / 2;

        SortTask task1 = new SortTask(arr, 0, mid);
        SortTask task2 = new SortTask(arr, mid, arr.length);

        task1.start();
        task2.start();

        task1.join();
        task2.join();

        Arrays.sort(arr); // Merge the two parts
        System.out.println(Arrays.toString(arr));
    }
}

