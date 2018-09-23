package chapter2.t15_synTwoLock;

/**
 * printA和printB共用一把Class的锁，printC用的是Class实例的对象，不是一把锁
 * 所有A，B同步，C异步
 */
public class Service {

	synchronized public static void printA() {
		try {
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "进入printA");
			Thread.sleep(5000);
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "离开printA");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public static void printB() {
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在"
				+ System.currentTimeMillis() + "进入printB");
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在"
				+ System.currentTimeMillis() + "离开printB");
	}

	synchronized public void printC() {
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在"
				+ System.currentTimeMillis() + "进入printC");
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在"
				+ System.currentTimeMillis() + "离开printC");
	}

}
