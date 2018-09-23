package chapter1.t11_interruptBreak;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态了!我要退出了!");
//                break;

                    throw new InterruptedException();

                }
                System.out.println("i=" + (i + 1));
            }
        } catch (InterruptedException e) {
            System.out.println("这句话打印出来说明throw让整个线程断掉");
        }
        System.out.println("这句话打印出来说明break没有让整个线程断掉");
    }

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
