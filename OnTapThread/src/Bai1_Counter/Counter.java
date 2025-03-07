package Bai1_Counter;

public class Counter extends Thread {
	private int counter;

	public synchronized void increse() {
		System.out.println("Counter: "+ counter++);
	}

	public int getCounter() {
		return counter;
	}
}
