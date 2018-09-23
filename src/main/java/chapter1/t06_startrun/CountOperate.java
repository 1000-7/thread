package chapter1.t06_startrun;

public class CountOperate extends Thread {

    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("run---end");
    }

    public static void main(String[] args) {
        CountOperate c = new CountOperate();//main
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.run();//A线程
    }
}
