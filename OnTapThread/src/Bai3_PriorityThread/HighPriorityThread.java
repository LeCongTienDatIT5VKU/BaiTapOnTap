package Bai3_PriorityThread;

class HighPriorityThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Luồng ưu tiên cao đang chạy...");
            Thread.yield();
        }
    }
}

