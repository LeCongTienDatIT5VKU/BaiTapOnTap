package Bai2_deadlock;

class FixedThread1 extends Thread {
    public void run() {
        synchronized (SharedResource.resource1) {
            System.out.println("Thread 1: Đã khóa resource1");
            
            try { Thread.sleep(50); } catch (InterruptedException e) {}

            synchronized (SharedResource.resource2) {
                System.out.println("Thread 1: Đã khóa resource2");
            }
        }
    }
}

class FixedThread2 extends Thread {
    public void run() {
        synchronized (SharedResource.resource1) { 
            System.out.println("Thread 2: Đã khóa resource1");

            try { Thread.sleep(50); } catch (InterruptedException e) {}

            synchronized (SharedResource.resource2) {
                System.out.println("Thread 2: Đã khóa resource2");
            }
        }
    }
}

public class FixedDeadlockExample {
    public static void main(String[] args) {
        FixedThread1 t1 = new FixedThread1();
        FixedThread2 t2 = new FixedThread2();

        t1.start();
        t2.start();
    }
}

