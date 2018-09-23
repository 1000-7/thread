package chapter2.t21_volatile2;

public class Run {
	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(2000);
			thread.setRunning(false);
			System.out.println("已经赋值为false");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
