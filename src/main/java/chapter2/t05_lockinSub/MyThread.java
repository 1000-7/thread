package chapter2.t05_lockinSub;

public class MyThread extends Thread {
	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
