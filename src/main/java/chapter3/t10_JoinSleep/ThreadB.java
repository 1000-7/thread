package chapter3.t10_JoinSleep;

public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("   b run begin timer="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("   b run   end timer="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 能打印就说明释放了锁，不能就是没有释放
     */
    synchronized public void bService() {
        System.out.println("打印了bService timer=" + System.currentTimeMillis());
    }

}
