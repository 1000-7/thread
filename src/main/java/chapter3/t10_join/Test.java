package chapter3.t10_join;

public class Test {

    public static void main(String[] args) {

        MyThread threadTest = new MyThread();
        threadTest.start();

        // Thread.sleep(?) 放多少不确定
        try {
            threadTest.join(); //join就可以了
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我想当threadTest对象执行完毕后我再执行");
        System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
        System.out.println("答案是：根据不能确定:)");
    }

}
