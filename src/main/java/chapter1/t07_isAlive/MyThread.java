package chapter1.t07_isAlive;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }

    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        System.out.println("begin ==" + mythread.isAlive());//肯定false
        mythread.start();//肯定true
        System.out.println("end ==" + mythread.isAlive());//都有可能
    }
}
