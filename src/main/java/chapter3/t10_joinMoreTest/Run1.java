package chapter3.t10_joinMoreTest;

/**
 * 线程b,a和b.join()都需要争b的锁，a应该先争到，然后b和b.join不一定谁先争到
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(10);
            System.out.println("main end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}