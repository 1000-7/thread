package chapter1.t16_return;

//多个return会造成代码污染，建议使用throw
public class MyThread extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了!");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}