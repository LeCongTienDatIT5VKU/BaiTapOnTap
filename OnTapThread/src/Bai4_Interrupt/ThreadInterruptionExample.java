package Bai4_Interrupt;

public class ThreadInterruptionExample {
    public static void main(String[] args) {
        InfiniteLoopThread thread = new InfiniteLoopThread();
        thread.start();

        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt(); 
    }
}
