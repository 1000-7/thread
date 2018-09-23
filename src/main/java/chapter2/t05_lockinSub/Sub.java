package chapter2.t05_lockinSub;

public class Sub extends Main {

	synchronized public void operateISubMethod() {
		try {
			while (i > 0) {
				i--;
				System.out.println("sub print i=" + i);
				Thread.sleep(100);
				this.operateIMainMethod();//子类完全可以通过可重入锁调用父类的同步方法的。
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
