package Bai3_PriorityThread;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        HighPriorityThread high = new HighPriorityThread();
        LowPriorityThread low = new LowPriorityThread();

       
        high.setPriority(Thread.MAX_PRIORITY);  
        low.setPriority(Thread.MIN_PRIORITY);   

        high.start();
        low.start();
    }
}

