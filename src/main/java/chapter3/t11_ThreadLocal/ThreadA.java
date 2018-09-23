package chapter3.t11_ThreadLocal;

public class ThreadA extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadA set Value=" + (i + 1));
                Tools.tl.set("ThreadA" + (i + 1));
                System.out.println("ThreadA get Value=" + Tools.tl.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
