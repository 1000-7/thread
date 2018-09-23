package chapter3.t10_joinException;

public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String("aas");
            Math.random();
            System.out.println(newString);
        }
    }
}
