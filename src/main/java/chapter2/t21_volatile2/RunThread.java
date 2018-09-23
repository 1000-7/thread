package chapter2.t21_volatile2;

/**
 * 不加volatile时，isRunning这个变量在公共堆栈是false，私有堆栈还是true，不会停止
 * 线程的内存和main的内存，run方法用的是现成的内存，所以看不到main 内存已经被设为false了
 *
 * 加了之后，isRunning这个变量就是在公共堆栈里，读的也是main内存堆栈，写的也是main内存堆栈
 */
public class RunThread extends Thread {
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning == true) {
        }
        System.out.println("线程被停止了！");
    }

}
