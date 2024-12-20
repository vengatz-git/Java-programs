package taskCode;

class number1 {
    private boolean evenTurn = true;

    public synchronized void printEven(int num) {
        while (!evenTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Even Thread: " + num);
        evenTurn = false;
        notify();
    }

    public synchronized void printOdd(int num) {
        while (evenTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Odd Thread: " + num);
        evenTurn = true;
        notify();
    }
}

class EvenThread extends Thread {
    private number1 printer;

    public EvenThread(number1 printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            printer.printEven(i);
        }
    }
}

class OddThread extends Thread {
    private number1 printer;

    public OddThread(number1 printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            printer.printOdd(i);
        }
    }
}

public class SynchronizedOddEvenTask {
    public static void main(String[] args) {
    	number1 printer = new number1();
        EvenThread evenThread = new EvenThread(printer);
        OddThread oddThread = new OddThread(printer);

        evenThread.start();
        oddThread.start();
    }
}
