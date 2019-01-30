
package chapter7.t01_stateTest.test3;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		MyService.serviceMethod();
	}

}
