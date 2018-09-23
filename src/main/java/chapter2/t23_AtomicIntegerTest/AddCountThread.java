package chapter2.t23_AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
	private AtomicInteger count = new AtomicInteger(0);

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(count.incrementAndGet());
		}
	}
}
