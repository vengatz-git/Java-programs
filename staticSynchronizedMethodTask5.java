package taskCode;

class Printer {
    public static synchronized void print(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class staticSynchronizedMethodTask5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> Printer.print("Hello from Thread 1"));
        Thread t2 = new Thread(() -> Printer.print("Hello from Thread 2"));

        t1.start();
        t2.start();
    }
}
