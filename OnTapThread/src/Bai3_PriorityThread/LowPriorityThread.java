package Bai3_PriorityThread;

class LowPriorityThread extends Thread {
    public void run() {
        while (true) {
            System.out.println(">>> Luồng ưu tiên thấp chạy.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
