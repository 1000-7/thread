package chapter2.t23_AtomicIntegerTest;

/**
 * 最后的值肯定没问题，但是方法与方法间的调用并不是原子的。
 */
public class Run {

	public static void main(String[] args) {
		AddCountThread countService = new AddCountThread();

		Thread t1 = new Thread(countService);
		t1.start();

		Thread t2 = new Thread(countService);
		t2.start();

		Thread t3 = new Thread(countService);
		t3.start();

		Thread t4 = new Thread(countService);
		t4.start();

		Thread t5 = new Thread(countService);
		t5.start();

	}

}
