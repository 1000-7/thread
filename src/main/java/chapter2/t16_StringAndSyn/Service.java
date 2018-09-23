package chapter2.t16_StringAndSyn;

/**
 * 因为ThreadB的参数和ThreadA的参数一致，Service对象根本不觉得有另一对象去竞争锁
 * 直接就是第一个拿到锁的人一直在用
 * 所以一般都不会String作为锁对象
 */
public class Service {
	public static void print(String stringParam) {
		try {
			synchronized (stringParam) {
				while (true) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
