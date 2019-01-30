package chapter7.t02_threadGroup.test1;

public class Run {

	public static void main(String[] args) {
		ThreadA aRunnable = new ThreadA();
		ThreadB bRunnable = new ThreadB();

		ThreadGroup group = new ThreadGroup("线程组");


		Thread aThread = new Thread(group, aRunnable);
		Thread bThread = new Thread(group, bRunnable);
		aThread.start();
		bThread.start();

		System.out.println("活动的线程数为：" + group.activeCount());
		System.out.println("线程组的名称为：" + group.getName());

	}
}
