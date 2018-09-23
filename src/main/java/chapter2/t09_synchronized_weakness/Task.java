package chapter2.t09_synchronized_weakness;

public class Task {

    private String getData1;
    private String getData2;

    public synchronized void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            getData1 = "长时间处理任务后从远程返回的值1 threadName="
                    + Thread.currentThread().getName();
            getData2 = "长时间处理任务后从远程返回的值2 threadName="
                    + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 用同步代码块解决同步方法的问题
     */
    public void doLongTimeTask1() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            String a = "长时间处理任务后从远程返回的值1 threadName="
                    + Thread.currentThread().getName();
            String b = "长时间处理任务后从远程返回的值2 threadName="
                    + Thread.currentThread().getName();
            synchronized (this) {
                getData1 = a;
                getData2 = b;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
