package chapter1.t21_priority;

public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority="
                + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end   priority="
                + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();//优先级具有继承性
        thread1.start();
    }
}
