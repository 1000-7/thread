package chapter1.t21_priority;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
