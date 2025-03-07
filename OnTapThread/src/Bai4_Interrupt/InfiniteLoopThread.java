package Bai4_Interrupt;

class InfiniteLoopThread extends Thread {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) { 
            System.out.println("Luồng đang chạy...");
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Luồng đã bị dừng!");
                break;
            }
        }
    }
}

