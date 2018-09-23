package chapter3.t10_join;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 1000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
