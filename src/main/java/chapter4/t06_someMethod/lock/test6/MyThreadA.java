package chapter4.t06_someMethod.lock.test6;

public class MyThreadA extends Thread {

	private Service service;

	public MyThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.waitMethod();
	}

}