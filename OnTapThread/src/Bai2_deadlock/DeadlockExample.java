package Bai2_deadlock;

class Thread1 extends Thread {
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

class Thread2 extends Thread {
    public void run() {
        synchronized (SharedResource.resource2) {
            System.out.println("Thread 2: Đã khóa resource2");

            try { Thread.sleep(50); } catch (InterruptedException e) {}

            synchronized (SharedResource.resource1) {
                System.out.println("Thread 2: Đã khóa resource1");
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
