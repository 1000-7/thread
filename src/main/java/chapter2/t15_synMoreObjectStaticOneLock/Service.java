package chapter2.t15_synMoreObjectStaticOneLock;

/**
 * 就算是不同的Service对象，还是同步打印，验证了是一把Class的锁
 */
public class Service {

	synchronized public static void printA() {
		try {
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "进入printA");
			Thread.sleep(3000);
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

}
