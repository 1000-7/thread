package chapter2.t16_StringAndSyn;

public class ThreadB extends Thread {
	private Service service;
	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.print("AA");
	}
}
