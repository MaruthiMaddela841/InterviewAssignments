package in.ineuron.assignment_8;

public class PrintNumbers {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500); // Sleep for 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}

