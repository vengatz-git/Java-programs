package taskCode;

class Access1 {
    void accessResource(String threadName) {
        synchronized (this) {
            System.out.println(threadName + " is accessing the resource...");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(threadName + " is done using the resource.");
        }
    }
}

public class SyncronizedTask2 {
    public static void main(String[] args) {
    	Access1 resource = new Access1();

        Thread t1 = new Thread(() -> resource.accessResource("Thread 1"));
        Thread t2 = new Thread(() -> resource.accessResource("Thread 2"));

        t1.start();
        t2.start();
    }
}

