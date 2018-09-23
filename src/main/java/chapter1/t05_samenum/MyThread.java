package chapter1.t05_samenum;

/**
 * i的线程同步
 */
public class MyThread extends Thread {

    private int i = 5;

    @Override
    synchronized public void run() {
        System.out.println("i=" + (i--) + " threadName="
                + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        MyThread run = new MyThread();

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
    //结果
    //i=4 threadName=Thread-2
    //i=3 threadName=Thread-3
    //i=5 threadName=Thread-1
    //i=2 threadName=Thread-4
    //i=1 threadName=Thread-5
    //应该还是加synchronized关键字
}
