package chapter2.t19_innerClass.test;

public class Run {
	public static void main(String[] args) {

		final OutClass.Inner inner = new OutClass.Inner();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				inner.method1();
			}
		}, "A");

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				inner.method2();
			}
		}, "B");

		t1.start();
		t2.start();

	}
}