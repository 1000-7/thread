package chapter1.t14_ThreadDeath;

public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
