package chapter1.t20_yield;

public class MyThread extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000; i++) {
            Thread.yield();//放弃当前的cpu，先给别人用，重新去找cpu
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime) + "毫秒！");
    }

}
