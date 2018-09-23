package chapter2.t21_volatile2;

public class PrintString implements Runnable {

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;
    }

    public void printStringMethod() {
        try {
            while (isContinuePrint == true) {
                System.out.println("run printStringMethod threadName="
                        + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
            System.out.println("能够停止了");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}