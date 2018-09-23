package chapter2.t17_twoStop;

/**
 * 同步方法容易无限等待，最后改成同步块
 */
public class ServiceStop {
	synchronized public void methodA() {
		System.out.println("methodA begin");
		boolean isContinueRun = true;
		while (isContinueRun) {
		}
		System.out.println("methodA end");
	}

	synchronized public void methodB() {
		System.out.println("methodB begin");
		System.out.println("methodB end");
	}
}
