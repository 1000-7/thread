package chapter3.t03_waitReleaseLock;

/**
 * wait执行后立马释放锁
 */
public class Test {

    public static void main(String[] args) {

        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        ThreadB b = new ThreadB(lock);
        b.start();

    }

}
