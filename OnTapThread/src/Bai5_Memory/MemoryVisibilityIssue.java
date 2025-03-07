package Bai5_Memory;

class Thread1 extends Thread {
    public void run() {
        while (!SharedResource.flag) { 
        }
        System.out.println("Thread 1 nhận thấy sự thay đổi của flag!");
    }
}

class Thread2 extends Thread {
    public void run() {
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        SharedResource.flag = true; 
        System.out.println("Thread 2 đã cập nhật flag = true");
    }
}

public class MemoryVisibilityIssue {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}
