package chapter7.t05_threadCreateException;

public class Main2 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("线程t1");
		t1.setUncaughtExceptionHandler((t, e) -> {
			System.out.println("线程:" + t.getName() + " 出现了异常：");
			e.printStackTrace();
		});
		t1.start();

		MyThread t2 = new MyThread();
		t2.setName("线程t2");
		t2.start();
	}
}
