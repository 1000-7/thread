package chapter3.t02_wait_notify_size5;

public class Run {

    public static void main(String[] args) {

        try {
            Object lock = new Object();

            ThreadA a = new ThreadA(lock);
            a.start();

            Thread.sleep(50);

            ThreadB b = new ThreadB(new Object());
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
