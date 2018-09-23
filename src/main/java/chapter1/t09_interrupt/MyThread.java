package chapter1.t09_interrupt;

/**
 * 没有真正被停止
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 50; i++) {
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }

}
