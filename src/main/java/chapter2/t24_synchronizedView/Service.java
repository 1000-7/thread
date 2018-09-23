package chapter2.t24_synchronizedView;

/**
 * synchronized锁执行的时候会同步线程内存变量和主内存变量，是isContinueRun更新为false。
 */
public class Service {

	private boolean isContinueRun = true;

	public void runMethod() {
		String anyString = new String();
		while (isContinueRun == true) {
			synchronized (anyString) {
			}
		}
		System.out.println("停下来了！");
	}

	public void stopMethod() {
		isContinueRun = false;
	}
}
