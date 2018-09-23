package chapter1.t21_priority_goodness;

/**
 * cpu会尽力调度资源让优先级高的先执行完，优先级是不确定的，只是倾向性。贝叶斯学派哈哈哈
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(1);
            thread1.start();

            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(10);
            thread2.start();
        }
    }
}
