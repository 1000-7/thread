package chapter2.t20_setnewStringTwoLock;

/**
 * 由于等待50毫秒，同一个service里的lock值已经变为456，A与B不同的String，所以不存在争抢
 */
public class Run1 {

	public static void main(String[] args) throws InterruptedException {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");

		ThreadB b = new ThreadB(service);
		b.setName("B");

		a.start();
		Thread.sleep(50);// 存在50毫秒
		b.start();
	}
}
