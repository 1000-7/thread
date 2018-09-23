package chapter1.t22_daemon;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);//thread是一个守护线程
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了！");//main线程结束了，守护线程就结束
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
