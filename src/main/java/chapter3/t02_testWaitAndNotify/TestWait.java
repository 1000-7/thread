package chapter3.t02_testWaitAndNotify;

public class TestWait {
    public static void main(String[] args) {
        new TestWait().test2();
    }

    public void test1() {
        String newString = new String("");
        try {
            newString.wait();//IllegalMonitorStateException
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void test2() {
        String lock = new String();
        System.out.println("syn上面");
        synchronized (lock) {
            System.out.println("第一行");
            try {
                lock.wait();//一直等待这，不继续往下运行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait下面的代码");
        }
        System.out.println("syn下面");

    }
}
