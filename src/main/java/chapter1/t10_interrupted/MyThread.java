package chapter1.t10_interrupted;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
