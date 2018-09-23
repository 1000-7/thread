package chapter1.t01;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }

    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();
        System.out.println("运行结束！");
    }

}
