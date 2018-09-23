package chapter2.t22_volatileTestThread;


//volatile public static int count;的结果
//count=200
//count=400
//count=300
//count=200
//count=500
//count=600
//count=700
//count=800
//count=900
public class MyThread extends Thread {
    volatile public static int count;

    private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }

}
