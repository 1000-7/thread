package chapter2.t10_HalfHalf;

//带有同步代码块方法的非同步代码块是异步执行的
public class Task {

    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName="
                    + Thread.currentThread().getName() + " i=" + (i + 1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                System.out.println("synchronized threadName="
                        + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }

    }
}
