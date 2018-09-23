package chapter3.t03_notifyHoldLock;

public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName="
                        + Thread.currentThread().getName());
                //不加这句就是Thread先到阻塞队列，synNotifyMethodThread后到
                //加了这句就是synNotifyMethodThread先到阻塞队列。
                Thread.sleep(2000);

                lock.wait();
                System.out.println("  end wait() ThreadName="
                        + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin notify() ThreadName="
                        + Thread.currentThread().getName() + " time="
                        + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("  end notify() ThreadName="
                        + Thread.currentThread().getName() + " time="
                        + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
