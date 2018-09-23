package chapter3.t10_JoinSleep;

public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
//				Thread.sleep(6000);
                b.join();
                // Thread.sleep()不释放锁！
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}