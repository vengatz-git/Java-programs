package taskCode;

class Table {
    void printTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

public class SynchronizedMultiTask3 {
    public static void main(String[] args) {
        Table table = new Table();

        Thread t1 = new Thread(() -> table.printTable(5));
        Thread t2 = new Thread(() -> table.printTable(10));

        t1.start();
        t2.start();
    }
}
