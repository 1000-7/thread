package chapter1.t06_currentThread;

public class Run2 {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
//		mythread.start();
        mythread.run();
    }
}