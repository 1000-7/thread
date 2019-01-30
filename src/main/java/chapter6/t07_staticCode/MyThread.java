package chapter6.t07_staticCode;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(MyObject.getInstance().hashCode());
		}
	}
}
